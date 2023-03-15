package com.kavya.listerners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.kavya.utilities.ScreenShotUtility;

//A class is said to b adapter class which alaways implements the interface with empty implementations

public class TestCaseAcitivityAdpater extends TestListenerAdapter{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed"+result.getName());
		try {
			ScreenShotUtility.takescreenshot(result.getName(),result.getThrowable().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped"+result.getName());
		try {
			ScreenShotUtility.takescreenshot(result.getName(),result.getThrowable().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
