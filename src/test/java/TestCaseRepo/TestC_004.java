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

public class TestC_004 extends BaseClass{
	
	@Test(groups = {"Smoke","System"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePage hp= new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String fname=eutil.getDataFromExcel("Contacts",1,1);
		String lname=eutil.getDataFromExcel("Contacts",1,2);
		String title=eutil.getDataFromExcel("Contacts",1,3);
		CreatingNewContectPage cncp = new CreatingNewContectPage(driver);
		cncp.createNewContect(fname, lname, title);

}
}