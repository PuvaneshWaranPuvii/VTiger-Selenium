package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricUtility.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsMenu;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//getter
	

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}


	public WebElement getContactsMenu() {
		return contactsMenu;
	}


	public WebElement getAccountsMenu() {
		return accountsMenu;
	}


	public WebElement getSignoutOption() {
		return signoutOption;
	}
	
    /**
     * this is a business library to click on Leads Menu
     */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	/**
	 * this is a business library to click on Contacts menu
	 */
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}
	
	/**
	 * this is a business library to perform sign out operation
	 * @param driver
	 */
	public void signoutOperation(WebDriver driver) {
		SeleniumUtility sutil=new SeleniumUtility();
		sutil.mouseHovering(driver, getAccountsMenu());
		getSignoutOption().click();
	}
	
	
	
}
