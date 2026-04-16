package genaricUtility;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation  implements ITestListener{
	
	ExtentReports reports;
	ExtentTest test;
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-yyyy hh-mm-ss");
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Start executed");
		
		//creating fields for every @Test method in the report
				test = reports.createTest(methodName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Success executed");
		
		//Logging the status as pass for test method
				test.log(Status.PASS, methodName+"-- sucessfully executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Failure executed");
		
		//Loggin the Status as Fail
		test.log(Status.FAIL,methodName+"--failed");
		test.log(Status.INFO,result.getThrowable());
		
		//Capturing the screenshot of the webpage
		String screenshootName=methodName+"--"+dateTimeStamp;
		
		JavaUtility jutil=new JavaUtility();
		String dateTimeStamp=jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		String screenshotName=methodName+"-"+dateTimeStamp;
		
		SeleniumUtility sutil=new SeleniumUtility();
		try {
			String path=sutil.webpageScreenshot(BaseClass.sDriver,screenshotName);
			//Attaching the screenshot to the failed test reprt
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Skipped executed");
		
		// Logging the status as Skip
				test.log(Status.SKIP, methodName+"--Skipped");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On  Start executed");
		
		//Configuring the Report
		ExtentSparkReporter reporter =new ExtentSparkReporter(".\\Extent_Reports\\report--"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		// Generate an Empty Reports
				reports = new ExtentReports();
				reports.attachReporter(reporter);
				reports.setSystemInfo("Base URl","https://localhost:8888");
				reports.setSystemInfo("Base browser","chrome");
				reports.setSystemInfo("Base Platfrom","Windows");
				reports.setSystemInfo("Test Engineer","Bhuvi");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish executed");
		
		//Flushing the report
		reports.flush();
		
		
	}
	

}
