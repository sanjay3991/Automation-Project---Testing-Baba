package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {
	
	  public static String getReaddata(String path , int rowno , int colno)
	  {
		  String value="";
		  try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheetno=wb.getSheetAt(0);
			value=sheetno.getRow(rowno).getCell(colno).getStringCellValue();
			  
			  
		} catch (Exception e) {
			System.out.println("issue in get read data"+e);
		}
	  
	  return value;
	  }
	  
}
