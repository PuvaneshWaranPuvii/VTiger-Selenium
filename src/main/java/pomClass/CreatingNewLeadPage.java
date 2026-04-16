package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricUtility.SeleniumUtility;


public class CreatingNewLeadPage 
{

	@FindBy(name = "firstname")
	private WebElement firstnameTextfield;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;
	
	@FindBy(name = "company")
	private WebElement companyTextfield;
	
	@FindBy(name = "designation")
	private WebElement titleTextfield;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceTextfield;
	
	@FindBy(name = "noofemployees")
	private WebElement noOfEmployeesTextfield;
	
	@FindBy(name = "mobile")
	private WebElement mobileTextfield;
	
	@FindBy(name = "email")
	private WebElement emailTextfield;
	
	@FindBy(name = "city")
	private WebElement cityTextfield;
	
	@FindBy(name = "state")
	private WebElement stateTextfield;
	
	@FindBy(name = "country")
	private WebElement countryTextfield;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;

	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstnameTextfield() 
	{
		return firstnameTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

//	public void setSaveButton(WebElement saveButton) {
//		this.saveButton = saveButton;
//	}

	public WebElement getLastnameTextfield() 
	{
		return lastnameTextfield;
	}

	public WebElement getCompanyTextfield() {
		return companyTextfield;
	}

	public WebElement getTitleTextfield() {
		return titleTextfield;
	}

	public WebElement getLeadscorceTextfield() {
		return leadSourceTextfield;
	}

	public WebElement getNoOfEmployeesTextfield() {
		return noOfEmployeesTextfield;
	}

	public WebElement getMobileTextfield() {
		return mobileTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getStateTextfield() {
		return stateTextfield;
	}

	public WebElement getCountryTextfield() {
		return countryTextfield;
	}
	
	public void createNewLead(String fname,String lname ,String company)
	{
		getFirstnameTextfield().sendKeys(fname);
		getLastnameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getSaveButton().click();
	}
	public void createNewLead (String lname,String company, String title , String leadScorce,String noOfEmp)
	{
		getLastnameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getTitleTextfield().sendKeys(title);
		new SeleniumUtility().selectOptionByValue(getLeadscorceTextfield(),leadScorce);//dropdown
		getNoOfEmployeesTextfield().sendKeys(noOfEmp);
		getSaveButton().click();
	}
	public void createNewLead (String lname, String company, String mobile,String email,String city,String state,String country)
	{
		getLastnameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getMobileTextfield().sendKeys(mobile);
		getEmailTextfield().sendKeys(email);
		getCityTextfield().sendKeys(city);
		getStateTextfield().sendKeys(state);
		getCountryTextfield().sendKeys(country);
		
		getSaveButton().click();
	}
	
}