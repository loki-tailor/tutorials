package Final;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Extraction {
	
	
	public static void  Apk(String packageName) throws Exception 
	{
		
		long start = System.currentTimeMillis();
		long end = start + 100000;
		
		
			do {
				Thread.sleep(1000);
				System.out.println("waiting for install........");
			}
			while(PresentApp(packageName)==false && System.currentTimeMillis() < end);
				
			
			ApkExtract.CApkExtraction(packageName);
			
			System.out.println("Extraction process finished..");
	
		}		
		
	
	
	
	public static boolean PresentApp(String packages) throws Exception
	{
		{
			boolean PresentApp = false;
			String appPresent="app is not present";
			
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec("adb shell pm path" + " " + packages);
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null)
			{
				PresentApp=true;
				System.out.println("package is present");
				appPresent="app is present";
				break;			
			}
			System.out.println(appPresent);
			
			return PresentApp;
		}
		
	}

	}


