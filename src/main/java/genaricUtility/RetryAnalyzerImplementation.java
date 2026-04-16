package genaricUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation  implements IRetryAnalyzer{

	
	int count=1;
	int maxCount=4;
	@Override
	public boolean retry(ITestResult result) {
	//1<=4 > true  2<=4 >true ..retry
	//4<=4 >true   5<=4 >false ...stop the retry.
		while(count<=maxCount) {
			count++;
			return true;
		}
		return false;
	}

}
