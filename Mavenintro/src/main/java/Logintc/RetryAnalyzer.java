package Logintc;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
int start = 0;
int end = 5;
	public boolean retry(ITestResult result) {
		if(start<=end) {
			start++;
			return true;//to execute the steps
		}
		return false;
	}

}
