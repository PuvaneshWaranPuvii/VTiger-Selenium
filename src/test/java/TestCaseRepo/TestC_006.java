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
public class TestC_006 extends BaseClass{

	
	@Test(groups = {"System"})
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String lname=eutil.getDataFromExcel("Contacts", 7, 1);
		String title=eutil.getDataFromExcel("Contacts", 7, 2);
		String mobile=eutil.getDataFromExcel("Contacts", 7, 3);
		String email=eutil.getDataFromExcel("Contacts", 7, 4);
		String mcity=eutil.getDataFromExcel("Contacts", 7, 5);
		String mstate=eutil.getDataFromExcel("Contacts",7,6);
		String mcountry=eutil.getDataFromExcel("Contacts", 7,7 );
		
		CreatingNewContectPage cncp=new CreatingNewContectPage(driver);
		cncp.createNewContect(lname, title, mobile, email, mcity, mstate, mcountry);
			
	}

}
