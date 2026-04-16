package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaring the WebElement
	
	@FindBy(name="user_name")
	private WebElement usernameTextFeiled;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	
	//Initializing the WebElements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//public Getters

	public WebElement getUsernameTextFeiled() {
		return usernameTextFeiled;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Utilizing the WebElemnt
	/**
	 * This is a Business Library to login to the Web application 
	 * @param UN
	 * @paramPWD
	 */
	
	public void LoginToApplication (String UN,String PWD) {
		getUsernameTextFeiled().sendKeys(UN);
		getPasswordTextField().sendKeys(PWD);
		getLoginButton().click();
		
	}
	
	
     
	

}
