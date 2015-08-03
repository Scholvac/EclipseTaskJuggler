package de.sos.logging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.statushandlers.StatusManager;

import de.sos.logging.console.ConsoleUtil;
import de.sos.preferences.PreferencesTool;

public class RuntimeConsoleLogHandler extends Handler{
	private static final String QUALIFIER = "de.scholvac.eclipse.utils.logging";
	private static final String NODE = "RuntimeConsoleLogHandler";
	
	
	private MessageConsole mConsole = null;
	private ArrayList<LogRecord> mRemainingRecords = new ArrayList<LogRecord>();
	
	private boolean mWriteErrorLog = true;
//	private boolean mWriteProblemsLog = false;
	
	
	private static HashMap<Level, Integer>	mLevelColors = new HashMap<Level, Integer>();
	private static HashMap<Level, String> 	mLevelMarker = new HashMap<Level, String>();
	static {
		mLevelColors.put(Level.SEVERE, SWT.COLOR_DARK_RED);
		mLevelColors.put(Level.WARNING, SWT.COLOR_DARK_YELLOW);
		mLevelColors.put(Level.INFO, SWT.COLOR_BLACK);
		mLevelColors.put(Level.CONFIG, SWT.COLOR_GRAY);
		mLevelColors.put(Level.FINE, SWT.COLOR_GRAY);
		mLevelColors.put(Level.FINER, SWT.COLOR_GRAY);
		mLevelColors.put(Level.FINEST, SWT.COLOR_GRAY);
		
		mLevelMarker.put(Level.SEVERE, "ERROR");
		mLevelMarker.put(Level.WARNING, "WARNING");
		mLevelMarker.put(Level.INFO, "INFO");
		mLevelMarker.put(Level.CONFIG, "CONFIG");
		mLevelMarker.put(Level.FINE, "FINE");
		mLevelMarker.put(Level.FINER, "FINER");
		mLevelMarker.put(Level.FINEST, "FINEST");		
	}
	
	
	public RuntimeConsoleLogHandler(String consoleName){
		mConsole = ConsoleUtil.findConsole(consoleName);
		mWriteErrorLog = PreferencesTool.getBoolean(QUALIFIER, NODE, "writeErrorLog", mWriteErrorLog);
	}
	
	@Override
	public void close() throws SecurityException {
	}
	
	@Override
	public void flush() {
		synchronized (mRemainingRecords) {
			String[] msg = new String[mRemainingRecords.size()];
			int[] colors = new int[mRemainingRecords.size()];
			for (int i = 0; i < mRemainingRecords.size(); i++){
				
				
			}
		}
	}
	@Override
	public void publish(LogRecord record) {
		String str = getFormatter().format(record);
		int color = mLevelColors.get(record.getLevel());
		ConsoleUtil.write2Console(mConsole, str, color, true);
		
		if (record.getLevel() == Level.SEVERE){
			Status status = new Status(IStatus.ERROR, record.getLoggerName(), str);
			StatusManager.getManager().handle(status, StatusManager.LOG);
		}
	}
	
	
	public static void main(String[] args){
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		RuntimeConsoleLogHandler clh = new RuntimeConsoleLogHandler("foobar");
		clh.setFormatter(new Formatter() {
			
			@Override
			public String format(LogRecord record) {
				return "Foobar: " + record.getMessage();
			}
		});
		
		logger = Logger.getAnonymousLogger();
		logger.addHandler(clh);
		
		logger.setLevel(Level.SEVERE);

		logger.severe("Info Log");

		logger.warning("Info Log");

		logger.info("Info Log");

		logger.finest("Really not important");



	    // Set the LogLevel to Info, severe, warning and info will be written

	    // Finest is still not written

		logger.setLevel(Level.INFO);

		logger.severe("Info Log");

		logger.warning("Info Log");

		logger.info("Info Log");

		logger.finest("Really not important");

	}
}
