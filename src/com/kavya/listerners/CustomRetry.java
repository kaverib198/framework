package com.kavya.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetry implements IRetryAnalyzer{
	int retrycount=0;
	int maxretrycount=4;
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus() && retrycount<=maxretrycount) {
			try {
				Thread.sleep(3000);
				retrycount++;
				System.out.println("the retry count is:"+retrycount+"excutingtest case is  :"+result.getName());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		return true;
	}

}
