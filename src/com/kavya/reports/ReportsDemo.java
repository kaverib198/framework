package com.kavya.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {
	public static void main(String[] args) {
		
		ExtentReports extendreport=new ExtentReports("D:\\Nov830pm\\Framework\\Reports\\report.html");
		Map<String , String> map= new HashMap<String,String>();
		map.put("HI", "HELLO");
		map.put("JAVA", "SELENIUM");
		map.put("HARDWORK", "JOB");
		extendreport.addSystemInfo(map);
		
	//ExtentTest ExtentTest=	extendreport.startTest("Hardword", "Hello testcase");
		ExtentTest ExtentTest=	extendreport.startTest("HardWork");
		
		ExtentTest.log(LogStatus.PASS, "Browser is opended");
		ExtentTest.log(LogStatus.PASS, "Entered url as :www.gmail.com");
		ExtentTest.log(LogStatus.PASS, "dataTyping actions  is done on user name with testdata:kavya2390@gmail.com");
		ExtentTest.log(LogStatus.PASS, "clicked on next");
		ExtentTest.log(LogStatus.PASS, "dataTyping actions  is done on passwowrd with testdata:hardwork");
		ExtentTest.log(LogStatus.PASS, "clicked on signin button");
		ExtentTest.log(LogStatus.PASS, "browser is closed");
		
		extendreport.endTest(ExtentTest);
		extendreport.flush();
		extendreport.close();
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
