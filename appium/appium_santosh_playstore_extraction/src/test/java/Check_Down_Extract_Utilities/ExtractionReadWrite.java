package Check_Down_Extract_Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExtractionReadWrite
{
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;	
	
	
	
public static void WriteExcel(String packageName, String message) throws Exception {
	
	Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\prop.properties");									
    obj.load(objfile);						
    int start=Integer.parseInt(obj.getProperty("start"));
    int end=Integer.parseInt(obj.getProperty("end"));
		
		try {

		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");
		System.out.println(System.getProperty("user.dir"));
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("final");
//		int rowcount = sheet.getLastRowNum();
		for (int i = start; i <=end ; i++) 
		{

			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			if (value.equalsIgnoreCase(packageName)) 
			{
				//packageRowNo = i;
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

public static Object[][] ReadExcel() throws Exception {
	
	Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\prop.properties");									
    obj.load(objfile);						
    int start=Integer.parseInt(obj.getProperty("start"));
    int end=Integer.parseInt(obj.getProperty("end"));
	
	fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");

	workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("check");
	int totalRows  = end-start+1;   //3
	int totalCols = 1;
	int valuesrow=0;
	 String[][] tabArray = null;
	
	tabArray = new String[totalRows][totalCols];
	for (int i = start; i <end+1; i++)
	{
		
		if (sheet.getRow(i)!= null)
		
		{
			
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value);
			
			tabArray[valuesrow][0] = value;
			
		}
		valuesrow++;
				}
	
	return (tabArray);

}


}
