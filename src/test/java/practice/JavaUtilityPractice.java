package practice;

import genaricUtility.JavaUtility;

public class JavaUtilityPractice {
	public static void main(String[] args) {
		JavaUtility jutil=new JavaUtility();
		String dateTimeStamp=jutil.getCalendarDetails("dd-MM-YY hh-mm-ss");
		String dateStamp=jutil.getCalendarDetails("dd-MM-YY");
		int num1=jutil.getRandomNumber(1000);
		int num2=jutil.getRandomNumber(10);
		System.out.println(dateTimeStamp);
		System.out.println(dateStamp);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
