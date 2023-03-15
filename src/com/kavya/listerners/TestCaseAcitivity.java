package com.kavya.listerners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.kavya.utilities.ScreenShotUtility;

public class TestCaseAcitivity implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution completed"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("Testcase failed"+result.getName());
	try {
		ScreenShotUtility.takescreenshot(result.getName(),result.getThrowable().toString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped"+result.getName());
		try {
			ScreenShotUtility.takescreenshot(result.getName(),result.getThrowable().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TESTcase sucesspercent");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TESTcase satrted");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TESTcase finised");
		
	}

}
