package genaricUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


 /**
  * This is the utility class which deals with properties file
  * @author Bhuvi
  * @version 26-03-20
  */
public class PropertiesUtility {
	
	/**
	 * This is a generic method to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperties(String key) throws IOException{
		
		FileInputStream fis=new FileInputStream(IpathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	/**
	 * This is generic method to write data to properties file
	 * @param key
	 * @param value
	 * @param comment
	 * @throws IOException
	 */
	public void writeDataToProperties(String key,String value,String comment) throws IOException {
		FileInputStream   fis=	new FileInputStream(IpathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty(key,value);
		FileOutputStream fos=new FileOutputStream(IpathUtility.propertiesPath);
		prop.store(fos, comment);
	}

}
