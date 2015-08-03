package de.sos.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import de.sos.preferences.PreferencesTool;
import de.sos.preferences.ui.PreferenceConstants;
import eclipse.utils.Activator;

public class EclipseLogger implements IPropertyChangeListener {
	private static final String QUALIFIER = "de.scholvac.eclipse.utils.logging";
	private static final String NODE = "EclipseLogger";
	public static final String DEFAULT_ECLIPSE_CONSOLE_NAME = "Eclipse TaskJuggler";
	private static EclipseLogger theInstance = null;
	
	private String mLogLevel = Level.INFO.getName();
	private boolean mEnableConsoleLog = true;
	private boolean mEnableSystemLog = true;
	private boolean mEnableFileLog = false;
	
	private TJPLogFormatter mFormatter = null;
	private FileHandler mFileHandler;
	private ConsoleHandler mSystemOutHandler;
	private RuntimeConsoleLogHandler mEclipseConsoleHandler;
	
	public static EclipseLogger init()
	{
		if (theInstance != null)
			return theInstance;
		theInstance = new EclipseLogger();
		return theInstance;
	}
	
	public static String getCallerClassName() {
		//using reflections should be quite fast, but unfortunately oracle removed (not only deprecated!) this method
		//return sun.reflect.Reflection.getCallerClass(callStackDepth).getName();
		return Thread.currentThread().getStackTrace()[3].getClassName();
    }
	
	
	public static void error(String message)
	{
		try{
			Logger l = Logger.getLogger(getCallerClassName());
			l.log(Level.SEVERE, message);
		}catch(Exception e){ System.out.println("Failed to Log message: " + message); }
	}
	
	
	public static void warn(String message)
	{
		try{
			Logger l = Logger.getLogger(getCallerClassName());
			l.log(Level.WARNING, message);
		}catch(Exception e){ System.out.println("Failed to Log message: " + message); }
	}
	
	public static void info(String message)
	{
		try{
			Logger l = Logger.getLogger(getCallerClassName());
			l.log(Level.INFO, message);
		}catch(Exception e){ System.out.println("Failed to Log message: " + message); }
	}
	
	public static void debug(String message)
	{
		try{
			Logger l = Logger.getLogger(getCallerClassName());
			l.log(Level.FINE, message);
		}catch(Exception e){ System.out.println("Failed to Log message: " + message); }
	}
	
	public static void trace(String message)
	{
		try{
			Logger l = Logger.getLogger(getCallerClassName());
			l.log(Level.FINER, message);
		}catch(Exception e){ System.out.println("Failed to Log message: " + message); }
	}
	
	private void loadPreferences()
	{
		IPreferenceStore pref_store = Activator.getDefault().getPreferenceStore();
		mEnableConsoleLog = PreferencesTool.getBoolean(pref_store, PreferenceConstants.P_ENABLE_RUNTIME_CONSOLE, mEnableConsoleLog);
		mEnableSystemLog = PreferencesTool.getBoolean(pref_store, PreferenceConstants.P_ENABLE_SYSTEM_OUT, mEnableSystemLog);
		mEnableFileLog = PreferencesTool.getBoolean(pref_store, PreferenceConstants.P_ENABLE_FILE_LOG, mEnableFileLog);
		
		mLogLevel = PreferencesTool.getString(pref_store, PreferenceConstants.P_LOG_LEVEL, mLogLevel);
		
		enableRuntimeConsoleLog(mEnableConsoleLog);
		enableSystemLog(mEnableConsoleLog);
		mEnableFileLog(mEnableFileLog);
		
		Level level = Level.parse(mLogLevel);
		getRootLogger().setLevel(level);
	}
	
	
	private EclipseLogger() {
		mFormatter = new TJPLogFormatter();
		
		IPreferenceStore pref_store = Activator.getDefault().getPreferenceStore();
		loadPreferences();
		
		pref_store.addPropertyChangeListener(this);
	}

	
	private Logger getRootLogger(){
		Logger l = Logger.getGlobal();
		while(l.getParent() != null && l.getParent() != l){
			l = l.getParent();
		}
		return l;
	}
	private void clearHandler(Logger l){
		Handler[] handler = l.getHandlers();
		for (Handler h : handler)
			l.removeHandler(h);
	}
	private boolean containsHandler(Logger l, Handler h){
		Handler[] handler = l.getHandlers();
		for (Handler han : handler){
			if (han == h)
				return true;
		}
		return false;
	}
	private void enableHandler(Logger l, Handler h, boolean e){
		if (h != null){
			if (e){
				if (!containsHandler(l, h))
					l.addHandler(h);
			}else{
				l.removeHandler(h);
			}
		}
	}
	public void enableRuntimeConsoleLog(boolean b) {
		Logger logger = getRootLogger();
		Handler sh = getRuntimeConsoleHandler();
		enableHandler(logger, sh, b);
		mEnableConsoleLog = b;
	}


	public RuntimeConsoleLogHandler getRuntimeConsoleHandler() {
		if (mEclipseConsoleHandler == null){
			mEclipseConsoleHandler = new RuntimeConsoleLogHandler(DEFAULT_ECLIPSE_CONSOLE_NAME);
			mEclipseConsoleHandler.setFormatter(mFormatter);
		}
		return mEclipseConsoleHandler;
	}


	public void enableSystemLog(boolean b) {
		Logger logger = getRootLogger();
		Handler sh = getSystemOutHandler();
		enableHandler(logger, sh, b);
		if (b){
			//remove default handler
			Handler[] all = logger.getHandlers();
			for (Handler h : all){
				if (h instanceof ConsoleHandler && h != sh){
					logger.removeHandler(h);
				}
			}
		}
		mEnableSystemLog = b;
	}


	public ConsoleHandler getSystemOutHandler() {
		if (mSystemOutHandler == null){
			mSystemOutHandler = new ConsoleLogHandler();
			mSystemOutHandler.setFormatter(mFormatter);
		}
		return mSystemOutHandler;
	}


	public void mEnableFileLog(boolean b) {
		Logger logger = getRootLogger();
		Handler sh = getFileHandler();
		enableHandler(logger, sh, b);
		mEnableFileLog = b;
	}


	private FileHandler getFileHandler() {
		if (mFileHandler == null)
		{
			try {
				mFileHandler = new FileHandler("TJPLog.txt");
				mFileHandler.setFormatter(mFormatter);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		return mFileHandler;
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		loadPreferences();		
	}
	
	
}
