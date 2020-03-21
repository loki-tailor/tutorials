package ToRun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class OnlyExtract {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	XSSFCell cell;
	Properties obj;
	static FileInputStream fis;
	String compatibility1 = null;

	public static void ApkExtraction() throws Exception

	{
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\prop.properties");
		obj.load(objfile);
		int start = Integer.parseInt(obj.getProperty("start"));
		int end = Integer.parseInt(obj.getProperty("end"));
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("onlyExtract");

		for (int j = start; j < end; j++)

		{
			String pack = sheet.getRow(j).getCell(0).getStringCellValue();
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println(j);
			System.out.println(pack);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("Time is -" + dtf.format(now));

			Runtime runtime = Runtime.getRuntime();

			Process process = runtime.exec("adb shell pm path" + " " + pack);


			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			ArrayList<String> list = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				System.out.println("this is line -" + line);

				list.add(line);
			}

			System.out.println(list.size());

			Iterator<String> m = list.iterator();
			while (m.hasNext()) {
				String s = m.next();
				if (s == null || s.isEmpty()) {
					m.remove();
				}
			}
			System.out.println(list.size());
			if (list.size() == 1) {
				String[] arrOfStr = list.get(0).split(":", 2);
				System.out.println(arrOfStr[1]);
				Runtime.getRuntime().exec("adb pull" + " " + arrOfStr[1] + " " + System.getProperty("user.dir")
						+ "\\src\\singleApks\\" + pack + ".apk");
				System.out.println("This is Single APK");
				WriteExcel(pack, "Single APK");

			}

			else if (list.size() > 1) {

				File file = new File(System.getProperty("user.dir") + "\\src\\multipleApk\\" + pack);
				try {

					file.mkdir();
				}

				catch (SecurityException Se) {

					System.out.println("Error while creating directory in Java:" + Se);

				}

				System.out.println(file);

				for (int i = 0; i < list.size(); i++)

				{
					String[] arrOfStr = list.get(i).split(":", 2);

					list.get(i);
					System.out.println("this list is" + list.get(i).length());

					System.out.println(arrOfStr[1]);

					Runtime.getRuntime().exec("adb pull" + " " + arrOfStr[1] + " " + System.getProperty("user.dir")
							+ "\\src\\multipleApk\\" + pack + "\\");
					Thread.sleep(100);

				}
				System.out.println("This is Multiple APK");

				WriteExcel(pack, "Multiple APK APK");

			}

			else {

				System.out.println("APK Not found");
				WriteExcel(pack, "Not Found");
			}
			Thread.sleep(300);
			Runtime.getRuntime().exec("adb uninstall" + " " + pack);
			Thread.sleep(300);

		}
	}

	public static void WriteExcel(String packageName, String message) throws Exception {

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\prop.properties");
		obj.load(objfile);
		int start = Integer.parseInt(obj.getProperty("start"));
		int end = Integer.parseInt(obj.getProperty("end"));

		try {

			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");
			System.out.println(System.getProperty("user.dir"));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("onlyExtract");
			for (int i = start; i <= end; i++) {

				String value = sheet.getRow(i).getCell(0).getStringCellValue();
				if (value.equalsIgnoreCase(packageName)) {
					sheet.getRow(i).createCell(2).setCellValue(message);

					break;
				}
			}

			FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");

			workbook.write(fos);
			fos.close();
			fis.close();
			System.out.println("sheet updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String args[]) throws Exception
	{
		ApkExtraction();
		
	}
}
