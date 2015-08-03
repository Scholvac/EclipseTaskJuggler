package de.sos.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import de.sos.preferences.PreferencesTool;

public class TJPLogFormatter extends Formatter {

	private static final String QUALIFIER = "de.scholvac.eclipse.utils.logging";
	private static final String NODE = "TJPLogFormater";
	
	private boolean mShowLevel = true;
	private boolean mShowThread = false;
	private boolean mShowSourceFile = false;
	private boolean mShowSourceMethod = false;
	private boolean mShowTimestamp = true;
	private boolean mShowLoggerName = false;
	private String mTimeStampFormat = "HH:mm:ss:SSS/dd-MM-yyyy";
	private SimpleDateFormat mTimestampFormatter;
	
	public TJPLogFormatter()
	{
		mShowLevel = PreferencesTool.getBoolean(QUALIFIER, NODE, "showLevel", true);
		mShowLoggerName = PreferencesTool.getBoolean(QUALIFIER, NODE, "showLoggerName", mShowLoggerName);
		mShowThread = PreferencesTool.getBoolean(QUALIFIER, NODE, "showThread", false);
		mShowSourceFile = PreferencesTool.getBoolean(QUALIFIER, NODE, "showSourceFile", false);
		mShowSourceMethod = PreferencesTool.getBoolean(QUALIFIER, NODE, "showSourceMethod", false);
		mShowTimestamp = PreferencesTool.getBoolean(QUALIFIER, NODE, "showTimestamp", true);
		mTimeStampFormat = PreferencesTool.getString(QUALIFIER, NODE, "timestampFormat", mTimeStampFormat);
		mTimestampFormatter = new SimpleDateFormat(mTimeStampFormat);
	}
	
	@Override
	public String format(LogRecord record) {
		StringBuilder sb = new StringBuilder();
		if (mShowLoggerName){
			sb.append(record.getLoggerName());
			sb.append(" : ");
		}
		if (mShowTimestamp){
			sb.append(mTimestampFormatter.format(new Date(record.getMillis())));
			sb.append("- ");
		}
		if (mShowThread){
			sb.append("Thread: ");
			sb.append(record.getThreadID());
			sb.append(" - ");
		}
		if (mShowLevel){
			sb.append("[");
			sb.append(record.getLevel().toString());
			sb.append("] ");
		}
		sb.append(record.getMessage());
		if (mShowSourceFile){
			sb.append(" at: ");
			sb.append(record.getSourceClassName());
			sb.append(" ");
		}
		if (mShowSourceMethod){
			if (mShowSourceFile == false)
				sb.append(" at: " );
			sb.append(record.getSourceMethodName());
			sb.append(" ");
		}
		
		return sb.toString();
	}

}
