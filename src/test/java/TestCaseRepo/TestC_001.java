package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genaricUtility.BaseClass;
import pomClass.CreatingNewLeadPage;
import pomClass.HomePage;
import pomClass.LeadsPage;

@Listeners(genaricUtility.ListenersImplementation.class)
public class TestC_001 extends BaseClass {
	
	int i=0;
	@Test(groups = {"Regression","System"},retryAnalyzer = genaricUtility.RetryAnalyzerImplementation.class)
	public void annotationOperation() throws IOException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lead = new LeadsPage(driver);
		lead.clickOnCreateLeadIcon();
//		if(i<3) 
//		{
//			i++;
//		//Assert.fail();
//		}
		String fName = eutil.getDataFromExcel("leads", 1, 1);
		String lName = eutil.getDataFromExcel("leads", 1, 2);
		String company =eutil.getDataFromExcel("leads", 1, 3);
		CreatingNewLeadPage cnl=new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company);
	}
	

}
