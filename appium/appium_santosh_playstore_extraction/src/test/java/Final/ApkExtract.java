package Final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Check_Down_Extract_Utilities.ExtractionReadWrite;

public class ApkExtract {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	Properties obj;
	FileInputStream fis;
	
	public static void main(String[] args) throws Exception {
		CApkExtraction("com.facebook.lite");
	}

	public static void CApkExtraction(String package_name) throws Exception {

		System.out.println("App is ready to extract");

		Runtime runtime = Runtime.getRuntime();

		// Package name
		String pack = package_name;

		Process process = runtime.exec("adb shell pm path" + " " + pack);

		// you might need the full path
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		ArrayList<String> list =new ArrayList<>();
		while ((line = br.readLine()) != null)
		{	
			System.out.println("this is line -"+line);
			
			list.add(line);			
		}
		
		System.out.println(list.size());
		
		Iterator<String> m = list.iterator();
		while (m .hasNext())
		{
		    String s = m .next();
		    if (s == null || s.isEmpty())
		    {
		    	m .remove();
		    }
		}		
		System.out.println(list.size());
		if (list.size() == 1) 
		{
			String[] arrOfStr = list.get(0).split(":", 2);
			System.out.println(arrOfStr[1]);
			Runtime.getRuntime().exec("adb pull" + " " + arrOfStr[1] + " "+ 
		    System.getProperty("user.dir") +"\\src\\singleApks\\"+ pack + ".apk");			
			System.out.println("This is Single APK");
		
		
		ExtractionReadWrite.WriteExcel(pack, "Single APk");
		} 
		
		else if (list.size() > 1)
		{
			
			
			File file = new File(System.getProperty("user.dir") +"\\src\\multipleApk\\"+pack);
			try {
				
				   file.mkdir();
				}
			
			catch (SecurityException Se)
			{
				
				System.out.println("Error while creating directory in Java:" + Se);
				
				}			
			System.out.println("This is Multiple APK");
			System.out.println(file);
			
			
			
			for(int i=0; i<list.size(); i++)
				
			{
				String[] arrOfStr = list.get(i).split(":", 2);
				
				list.get(i);
				System.out.println("this list is"+ list.get(i).length());
				
		    System.out.println(arrOfStr[1]);
			
			Runtime.getRuntime().exec("adb pull" + " " + arrOfStr[1] + " "+ 
				   System.getProperty("user.dir") +"\\src\\multipleApk\\"+pack+"\\");
			Thread.sleep(40);
			
			
			
			ExtractionReadWrite.WriteExcel(pack, "Multiple APK");
			}
			
		}

		else {
			Thread.sleep(2000);
			System.out.println("APK Not found");
		}
	
		Runtime.getRuntime().exec("adb uninstall"+" "+pack);
		
		}
	}

