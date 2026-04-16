package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genaricUtility.BaseClass;
import pomClass.ContactsPage;
import pomClass.CreatingNewContectPage;
import pomClass.HomePage;

@Listeners(genaricUtility.ListenersImplementation.class)
public class TestC_005 extends BaseClass {
		
	@Test(groups = {"Smoke"})
	
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String lname=eutil.getDataFromExcel("Contacts", 4,1);
		String dep=eutil.getDataFromExcel("Contacts", 4, 2);
		String email=eutil.getDataFromExcel("Contacts", 4, 3);
		String mobile=eutil.getDataFromExcel("Contacts", 4, 4);
		
		CreatingNewContectPage cncp=new CreatingNewContectPage(driver);
		cncp.createNewContect(lname, dep, email, mobile);	
		
		
	}
	@Test
	public void m2() {
		System.out.println("Bhuvi......");
	}
	

}
