package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genaricUtility.BaseClass;
import pomClass.CreatingNewLeadPage;
import pomClass.HomePage;
import pomClass.LeadsPage;


@Listeners(genaricUtility.ListenersImplementation.class)
public class TestC_003 extends BaseClass{
	
	@Test(groups = {"Regression","Smoke"})
	
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateLeadIcon();
		String lname=eutil.getDataFromExcel("Leads", 7, 1);
		String company=eutil.getDataFromExcel("Leads", 7, 2);
		String mobile=eutil.getDataFromExcel("Leads", 7, 3);
		String email=eutil.getDataFromExcel("Leads", 7, 4);
		String city=eutil.getDataFromExcel("Leads", 7, 5);
		String state=eutil.getDataFromExcel("Leads", 7, 6);
		String country=eutil.getDataFromExcel("Leads", 7, 7);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname, company, mobile, email, city, state, country);
	}
}