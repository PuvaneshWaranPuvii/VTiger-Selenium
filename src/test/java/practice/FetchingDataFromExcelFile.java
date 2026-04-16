package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genaricUtility.ExcelUtility;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\AMIN\\Downloads\\selenium xl.xlsx");
       // Workbook wb=WorkbookFactory.create(fis);
       // Sheet sh=wb.getSheet("Animal");
        //Row r=sh.getRow(2);
       // Cell c=r.getCell(1);
       // String Value=c.getStringCellValue();
     //   System.out.println(Value);
        //single Row o/p
        //Double
        
      //  Cell c2=wb.getSheet("Actors").getRow(0).getCell(0);
        //String value2=c2.getStringCellValue();
       // System.out.println(value2);
        //Cell c3=wb.getSheet("Cartoon").getRow(1).getCell(2);
       // String value3=c3.getStringCellValue();
       // System.out.println(value3);
        
        ExcelUtility eutil=new ExcelUtility();
        String value1=eutil.getDataFromExcel("Actors", 1, 1);
        String value2=eutil.getDataFromExcel("Animal", 5, 0);
        System.out.println(value1);
        System.out.println(value2);
        
	
	
	}

}
