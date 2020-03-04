package script;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

import file.MyFile;

public class ExtractionScript {

	public static final String resultsPath = "/home/lokesh/git/tutorials/PlayStoreExtraction/result.csv";
	public static final String logsPath = "/home/lokesh/git/tutorials/PlayStoreExtraction/logs.csv";
	private static final String LINE_SEPARATOR = "\n***********************************************************************\n";

	public static void main(String[] args) throws Exception {
		extractApkUsingPackageName("com.facebook.lite");
	}

	public static void extractApkUsingPackageName(String package_name) throws Exception {

		MyFile.append(logsPath, LINE_SEPARATOR);

		MyFile.append(logsPath, "APK_EXTRACTION_STARTED : " + package_name);

		Runtime runtime = Runtime.getRuntime();
		
		Process process = runtime.exec("adb shell pm path" + " " + package_name);

		// you might need the full path
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		ArrayList<String> list = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			list.add(line);
		}

		System.out.println("NO_OF_APKS : " + list.size());

		// remove empty lines
		Iterator<String> m = list.iterator();
		while (m.hasNext()) {
			String s = m.next();
			if (s == null || s.isEmpty()) {
				m.remove();
			}
		}

		if (list.size() == 1) {
			String[] arrOfStr = list.get(0).split(":", 2);
			System.out.println(arrOfStr[1]);
			Runtime.getRuntime().exec(
					"adb pull" + " " + arrOfStr[1] + " " + "/home/lokesh/git/tutorials/Test/" + package_name + ".apk");
			System.out.println("This is Single APK");

			// .WriteExcel(pack, "Single APk");
		}
		//
//			else if (list.size() > 1) {
		//
//				File file = new File(System.getProperty("user.dir") + "\\src\\multipleApk\\" + pack);
//				try {
		//
//					file.mkdir();
//				}
		//
//				catch (SecurityException Se) {
		//
//					System.out.println("Error while creating directory in Java:" + Se);
		//
//				}
//				System.out.println("This is Multiple APK");
//				System.out.println(file);
		//
//				for (int i = 0; i < list.size(); i++)
		//
//				{
//					String[] arrOfStr = list.get(i).split(":", 2);
		//
//					list.get(i);
//					System.out.println("this list is" + list.get(i).length());
		//
//					System.out.println(arrOfStr[1]);
		//
//					Runtime.getRuntime().exec("adb pull" + " " + arrOfStr[1] + " " + System.getProperty("user.dir")
//							+ "\\src\\multipleApk\\" + pack + "\\");
//					Thread.sleep(40);
		//
//					/// ExtractionReadWrite.WriteExcel(pack, "Multiple APK");
//				}
		//
//			}
		//
//			else {
//				Thread.sleep(2000);
//				System.out.println("APK Not found");
//			}

		// Runtime.getRuntime().exec("adb uninstall" + " " + package_name);

	}

	public static String runcommand(String command) {
		System.out.println();

		StringBuilder op = new StringBuilder();
		try {
			String cmd = new String(command.getBytes(Charset.defaultCharset()));
			System.out.println("$: " + cmd);

			Process process = new ProcessBuilder(cmd.split(" ")).start();
			process.waitFor();

			InputStream is = process.exitValue() != 0 ? process.getErrorStream() : process.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			String temp = "";
			while ((temp = br.readLine()) != null) {
				op.append(temp);
				op.append("\n");
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return op.toString();
	}

}
