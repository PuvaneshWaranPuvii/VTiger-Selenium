package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genaricUtility.ExcelUtility;

public class WritingDataToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility eutil=new ExcelUtility();
		eutil.writeDataToExcel("Actors", 4, 1, "Dhoni");
	}
	

}
