package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricUtility.ExcelUtility;
import genaricUtility.PropertiesUtility;
import genaricUtility.SeleniumUtility;
import pomClass.ContactsPage;
import pomClass.CreatingNewContectPage;
import pomClass.HomePage;
import pomClass.LoginPage;

public class POMPractice {
	@FindBy(name="user_name")
	WebElement usernameTF;                         ///staleElement handle
	public POMPractice(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		SeleniumUtility sutil=new SeleniumUtility();
		PropertiesUtility putil= new PropertiesUtility();
		ExcelUtility eutil=new ExcelUtility();
		String URL=putil.getDataFromProperties("url"); 
		String UN=putil.getDataFromProperties("username");
		String PWD=putil.getDataFromProperties("password");
		WebDriver driver=new ChromeDriver();
		sutil.accessApplication(driver, URL);
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApplication(UN,PWD);
		HomePage hp=new HomePage(driver);
	//	hp.clickOnLeadsMenu();
//		LeadsPage lep=new LeadsPage(driver);
//		lep.clickOnCreateLeadIcon();
//		String fname=eutil.getDataFromExcel("Leads",1,1);
//		String lname=eutil.getDataFromExcel("Leads",1,2);
//		String company=eutil.getDataFromExcel("Leads",1,3);
//		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);		
//		cnlp.createNewLead(fname, lname, company);
//		hp.signoutOperation(driver);
		
		
		//ExcelUtility eutil=new ExcelUtility();
		ContactsPage cop=new ContactsPage(driver);
		hp.clickOnContactsMenu();
		cop.clickOnCreateNewContactIcon();
		
		String  lname1=eutil.getDataFromExcel("Contacts", 7, 1);
		String  title=eutil.getDataFromExcel("Contacts", 7, 2);
		String  mobile=eutil.getDataFromExcel("Contacts", 7, 3);
		String  email=eutil.getDataFromExcel("Contacts", 7, 4);
		String  mcity=eutil.getDataFromExcel("Contacts", 7, 5);
		String  mstate=eutil.getDataFromExcel("Contacts", 7, 6);
		String  mcountry=eutil.getDataFromExcel("Contacts", 7, 7);
		CreatingNewContectPage cncp=new CreatingNewContectPage(driver);
		cncp.createNewContect(lname1, title, mobile, email, mcity, mstate, mcountry);
		
		Thread.sleep(2000);
		driver.quit();
	
//		POMPractice p=new  POMPractice(driver);
//		p.usernameTF.sendKeys(UN);
//		Thread.sleep(2000);
//		sutil.refreshWebpage(driver);
//		Thread.sleep(2000);
//		p.usernameTF.sendKeys(UN);
//		

	}

}