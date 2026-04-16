package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genaricUtility.PropertiesUtility;

public class StoringDataToPropertiesFile {
	public static void main(String[] args) throws IOException {
		
	//FileInputStream   fis=	new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Java Selenium\\Data.properties");
	//Properties prop=new Properties();
	//prop.load(fis);
    //	prop.setProperty("mobile", "8590852011");
	//FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Java Selenium\\Data.properties");
    //	prop.store(fos, "mobile number updated");
		PropertiesUtility putil=new PropertiesUtility();
		putil.writeDataToProperties("name", "Bhuvi","name is added");
		
	}

}
