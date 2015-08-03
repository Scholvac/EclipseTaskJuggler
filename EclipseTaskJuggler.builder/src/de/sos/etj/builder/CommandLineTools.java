package de.sos.etj.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineTools {
	static final int MODE_UNCONNECTED = 0;
	static final int MODE_WAITFOR = 1;
	static final int MODE_CATCHOUTPUT = 2;

	public static int runCommand(String cmd, int mode) throws IOException {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Running " + cmd);
		Process pr = rt.exec(cmd);

		if (mode == MODE_WAITFOR) {
			System.out.println("waiting for termination");
			try {
				pr.waitFor();
			} catch (InterruptedException e) {
			}
		} else if (mode == MODE_CATCHOUTPUT) {
			System.out.println("catching output");
			BufferedReader procout = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			while ((line = procout.readLine()) != null) {
				System.out.println("  OUT> " + line);
			}
		}
		try {
			System.out.println("done, return value is " + pr.exitValue());
		} catch (IllegalThreadStateException e) {
			System.out.println("ok, process is running asynchronously");
		}
		return pr.exitValue();
	}

	public static int runShellCommand(String cmd, int mode) throws IOException {
		String prefix = "";
		String osName = System.getProperty("os.name");
		osName = osName.toLowerCase();
		if (osName.indexOf("windows") != -1) {
			if (osName.indexOf("95") != -1) {
				prefix = "command.com /c ";
			} else if (osName.indexOf("98") != -1) {
				prefix = "command.com /c ";
			} else if (osName.indexOf("xp") != -1) {
				prefix = "command.com /c ";
			}
		}
		if (prefix.length() <= 0) {
			System.out.println("unknown OS: don\'t know how to invoke shell");
		} else {
			return runCommand(prefix + cmd, mode);
		}
		return 0;
	}

	/**
	 * Führt Kommandos in einer Konsole aus <br>
	 * Parameter: <br>
	 * <li>-waitfor = wartet, bis das komando ausgeführt wurde
	 * <li>-catchoutput = fängt die Rückgabe ab (Integer)
	 * <li>- shell = führt das komando in einer Shell aus
	 * 
	 * @param args
	 *            Befehl mit parametern (s.o.)
	 * @return 0 oder rückgabe des Programms, falls Parameter -catchoutput
	 *         aufgeführt
	 */
	public static int runCommand(String[] args) {
		int out = 0;
		try {
			if (args.length <= 0) {
				throw new NullPointerException(
						"Usage: java RunCommand [-shell] " + "[-waitfor|-catchoutput] <command>");
			}
			boolean shell = false;
			int mode = MODE_UNCONNECTED;
			boolean iswaitfor = false;
			boolean iscatchoutput = false;
			String cmd = "";
			for (int i = 0; i < args.length; ++i) {
				if (args[i].startsWith("-")) {
					if (args[i].equals("-shell")) {
						shell = true;
					} else if (args[i].equals("-waitfor")) {
						mode = MODE_WAITFOR;
						iswaitfor = true;
					} else if (args[i].equals("-catchoutput")) {
						mode = MODE_CATCHOUTPUT;
						iscatchoutput = true;
					}
				} else {
					cmd = args[i];
				}
			}
			if (shell) {
				out = runShellCommand(cmd, mode);
			} else {
				out = runCommand(cmd, mode);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.toString());
			throw new RuntimeException("Fehler beim Ausführen des Befehls");
		}

		return out;
	}

	public static void main(String[] args) {
		try {
			if (args.length <= 0) {
				System.out.println("Usage: java RunCommand [-shell] " + "[-waitfor|-catchoutput] <command>");

				args = new String[4];
				args[0] = "cmd";// mysql -h localhost -u root -p";
				args[2] = "-shell";
				args[1] = "-dcatchoutput";
				args[3] = "-waitfor";
			}
			runCommand(args);
		} catch (Exception e) {
		}
	}
}
