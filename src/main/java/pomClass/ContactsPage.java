package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a POM class for contacts web page
 * @author bhuvi
 * @version 26-3-27
 */
public class ContactsPage {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	

	public ContactsPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	//getter


	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	
	public void clickOnCreateNewContactIcon() {
		getCreateNewContactIcon().click();
	}
	
	
}
