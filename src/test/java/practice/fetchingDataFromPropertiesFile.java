package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genaricUtility.PropertiesUtility;

public class fetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Java Selenium\\Data.properties");
	    //Properties prop=new Properties();
	    //prop.load(fis);
	    //String url=prop.getProperty("url");
	   // String UN=prop.getProperty("username");
	    //String pwd=prop.getProperty("password");
		PropertiesUtility putil=new PropertiesUtility();
		String url=putil.getDataFromProperties("url");
		String UN=putil.getDataFromProperties("username");
		String pwd=putil.getDataFromProperties("password");
	    System.out.println(url);
	    System.out.println(UN);
	    System.out.println(pwd);
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get(url);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UN,Keys.TAB,pwd,Keys.ENTER);
	   // Thread.sleep(2000);
	   // driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("//button[@type='submit']")).submit();
	    
	
	}
	

}
