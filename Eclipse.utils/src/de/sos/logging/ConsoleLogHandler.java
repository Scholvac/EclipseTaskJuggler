package de.sos.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class ConsoleLogHandler extends ConsoleHandler
{
	@Override
	public void publish(LogRecord record) {
		String str = getFormatter().format(record);
		if (record.getLevel() == Level.SEVERE || record.getLevel() == Level.WARNING)
			System.err.println(str);
		else
			System.out.println(str);
	}
}
