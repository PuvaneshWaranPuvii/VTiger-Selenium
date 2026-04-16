package genaricUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This a generic method to fetch Calander details
 * @param pattern
 * @return
 */
public class JavaUtility {
	public String getCalendarDetails(String pattern) {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
	}
	/**
	 * this is a generic  method to generate random number 
	 * @param bound
	 * @return
	 */
	public int getRandomNumber(int bound) {
		Random r=new Random();
		int num =r.nextInt(bound);
		return num;
	}

}
