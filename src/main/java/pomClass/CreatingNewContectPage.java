package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContectPage 
{
	@FindBy(name = "firstname")
	private WebElement 	firstNameTextField;
	@FindBy(name = "lastname")
	private WebElement 	lastnameTextField;
	@FindBy(name = "title")
	private WebElement 	titleTextField;
	@FindBy(name = "department")
	private WebElement 	departmentTextField;
	@FindBy(name = "email")
	private WebElement 	emailTextField;
	@FindBy(name = "mobile")
	private WebElement 	mobileTextField;
	@FindBy(name = "mailingcity")
	private WebElement 	mailingcityTextField;
	@FindBy(name = "mailingstate")
	private WebElement 	mailingstateTextField;
	@FindBy(name = "mailingcountry")
	private WebElement 	mailingcountryTextField;
	@FindBy(name = "button")
	private WebElement 	saveButton;

	public CreatingNewContectPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}

	public WebElement getLastnameTextField() 
	{
		return lastnameTextField;
	}

	public WebElement getTitleTextField() 
	{
		return titleTextField;
	}

	public WebElement getDepartmentTextField() 
	{
		return departmentTextField;
	}

	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}

	public WebElement getMobileTextField() 
	{
		return mobileTextField;
	}

	public WebElement getMailingcityTextField() 
	{
		return mailingcityTextField;
	}

	public WebElement getMailingstateTextField() 
	{
		return mailingstateTextField;
	}

	public WebElement getMailingcountryTextField() 
	{
		return mailingcountryTextField;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	public void createNewContect(String fname,String lname,String title)
	{
		getFirstNameTextField().sendKeys(fname);
		getLastnameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
	}
	
	public void createNewContect(String lname,String department,String email,String mobile)
	{
		getLastnameTextField().sendKeys(lname);
		getDepartmentTextField().sendKeys(department);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	public void createNewContect(String lname,String title,String mobile,String email,String mailingCity,String mailingState,String mailingCountry) 
	{
		getLastnameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getMailingcityTextField().sendKeys(mailingCity);
		getMailingstateTextField().sendKeys(mailingState);
		getMailingcountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
}