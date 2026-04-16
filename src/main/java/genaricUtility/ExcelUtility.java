package genaricUtility;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is a utility class which deals with Excel file
 * @author Bhuvi
 * @version 26-03-23
 */
public class ExcelUtility {
	/**
	 * This is a generic method to fetch single cell data from Excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	
	public String getDataFromExcel(String sheetName, int rowIndex, int cellIndex)throws EncryptedDocumentException,IOException{
	
	FileInputStream fis=new FileInputStream(IpathUtility.excelPath);
	Workbook wb= WorkbookFactory.create(fis);
	Cell c=wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
	DataFormatter df=new DataFormatter();
	String value=df.formatCellValue(c);
	return value;
	}
	
	
	/**
	 * This is generic method to fetch multiple cell data from Excel file
	 * @param sheetName
	 * @param startIndex
	 * @return 
	 * @return 
	 * @pram startCellindex
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 */
public  java.util.List<String> getMultipleDataFromExcel(String sheetName, int startRowIndex,int startCellindex) throws EncryptedDocumentException, IOException{
	
	FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	DataFormatter df=new DataFormatter();
	 java.util.List<String> a1 = new ArrayList<String>();
	for(int i=startRowIndex;i<=sh.getLastRowNum();i++) {
		Row r=sh.getRow(i);
		
		for(int j=startCellindex;j<r.getLastCellNum();j++) {
			Cell c=r.getCell(j);
			String value=df.formatCellValue(c);
			a1.add(value);
		}
		
		}
	return a1;
	}
/**
 * This a generic method to write data to excel file
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void writeDataToExcel(String sheetName,int rowIndex,int cellIndex,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(IpathUtility.excelPath);
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName); 
	Row r=sh.getRow(rowIndex);
	Cell c=r.createCell(cellIndex);
	c.setCellValue(value);
	FileOutputStream fos=new FileOutputStream(IpathUtility.excelPath);
	wb.write(fos);
	
	
}
}
