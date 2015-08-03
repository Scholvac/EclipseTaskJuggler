package de.sos.logging.console;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleUtil {

	
	
	public static void println2Console(final String consoleName, final String msg) {
		write2Console(consoleName, msg, org.eclipse.swt.SWT.COLOR_BLACK, true);
	}
	
	public static void print2Console(final String consoleName, final String msg) {
		write2Console(consoleName, msg, org.eclipse.swt.SWT.COLOR_BLACK, false);
	}
	
	
	public static void errorln2Console(final String consoleName, final String msg) {
		write2Console(consoleName, msg, org.eclipse.swt.SWT.COLOR_RED, true);
	}
	
	public static void error2Console(final String consoleName, final String msg) {
		write2Console(consoleName, msg, org.eclipse.swt.SWT.COLOR_RED, false);
	}

	/**
	 * 
	 * @param consoleName
	 * @param msg
	 * @param org.eclipse.swt.SWT.SWTColor  
	 * @param newline println or print
	 */
	public static void write2Console(final String consoleName, final String msg, final int SWTColor, final boolean newline){
		write2Console(findConsole(consoleName), msg, SWTColor, newline);
	}
	
	public static void write2Console(final MessageConsole console, final String msg, final int SWTColor, final boolean newline){
		write2Console(console, new String[]{msg}, new int[]{SWTColor});
	}
	
	public static void write2Console(final MessageConsole console, final String[] lines, final int[] colors){
		if (lines.length != colors.length){
			System.err.println("mismatch of messages and colors, skip write request");
			return ;
		}
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageConsoleStream out = console.newMessageStream();
				Display current_display = Display.getCurrent();
				for (int i = 0; i < lines.length; i++){
					out.setColor(current_display.getSystemColor(colors[i]));
					out.println(lines[i]);
				}
			}
		});		
	}
	
	public static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		if (plugin == null)
			return null;
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

}
