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
public class TestC_002 extends BaseClass {
	@Test(groups = {"Smoke"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateLeadIcon();
		String lname=eutil.getDataFromExcel("Leads", 4, 1);
		String company=eutil.getDataFromExcel("Leads", 4, 2);
		String title=eutil.getDataFromExcel("Leads", 4, 3);
		String leadSource=eutil.getDataFromExcel("Leads", 4, 4);
		String noOfEmp=eutil.getDataFromExcel("Leads", 4, 5);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname, company, title, leadSource, noOfEmp);
		
	}
	
	

}
