package com.kavya.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.kavya.customizedexception.FrameworkException;
import com.kavya.utilities.ScreenShotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	private static WebDriver driver;
	private static String tcName;
	private static ExtentReports extentreport;
	private static	ExtentTest Extenttest;

	@Parameters({"browser"})
	@BeforeSuite
	public void OpenBrowser(@Optional("chrome")String browser) {
		
		//if we use driverpaths interface then below line we can comment 
		String CurrentDirectory=System.getProperty("user.dir");
		
		
		if(browser.equalsIgnoreCase("Edgebrowser")) {
			System.setProperty("webdriver.edge.driver","D:\\Nov830pm\\Framework \\Drivers\\edgedriver.exe");
			// line 28 can b written as 
						//System.setProperty("Driverpaths.edgekey", "Driverpaths.edgeValue");
			driver = new EdgeDriver();
			init();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Nov830pm\\Framework\\Drivers\\chromedriver.exe");
			// line 35 can b written as 
			//System.setProperty("Driverpaths.Chromekey", "Driverpaths.ChromeValue");
			driver = new ChromeDriver();
			init();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", CurrentDirectory+"\\Drivers\\firefoxdriver.exe");
			// line 42 can b written as 
			//System.setProperty("Driverpaths.firefoxkey", "Driverpaths.firefoxValue");
			driver = new FirefoxDriver();
			init();
			
		}else if(browser.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", CurrentDirectory+"\\Drivers\\safaridriver.exe");
			// line 48 can b written as 
			//System.setProperty("Driverpaths.safarikey", "Driverpaths.safariValue");
			driver = new SafariDriver();
			init();
			
		}
	}
	
	//******** as we are using Testcase acitivity we are not using before and after methods
	//if we want to know which testcase is running currently use below code
	/*@BeforeMethod
	//method is a class which is cumng from java.lang.reflect Method provides information about  testmethod which are going to b executed 
	public void beforeTcExection(Method method) {
		String tcName=method.getName();
		System.out.println("Current exection testcase name:"+tcName);
	}
	
	@AfterMethod
	//ITesetResult is a interface or listerner which is cumng from org.tsetng it contains testcase result inforamtion
	public void afterTcExection(ITestResult result) throws IOException {
		 tcName=result.getName();
	//System.out.println("Test case exection is completed");
		if(result.getStatus()==ITestResult.SUCCESS) {
			//System.out.println("Testcase passed:"+result.getName());
			System.out.println("Testcase passed:"+tcName);
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Testcase failed:"+result.getName());
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			System.out.println("Testcase failed so taking screnshot and the exception info is:"+result.getThrowable());
			File image=takescreenshot.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".jpeg"));
			FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg"));
	
			ScreenShotUtility.takescreenshot(tcName,result.getThrowable().toString());
		}else if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("Testcase skipped:"+result.getName());
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			System.out.println("Testcase skiped so taking screnshot and the exception info is:"+result.getThrowable());
			File image=takescreenshot.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".jpeg"));
			FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg"));
		
			ScreenShotUtility.takescreenshot();
		}
	
	

	}
	
*/	
	
	
	//this is used for creating an object fo extentreports object actiulay it should b writtened in line numb 81 for claroty worte another method here
	@BeforeMethod
	//method is a class which is cumng from java.lang.reflect Method provides information about  testmethod which are going to b executed 
	public void beforeTcExection(Method method) {
		String tcName=method.getName();
		System.out.println("Current exection testcase name:"+tcName);
		 Extenttest=extentreport.startTest(tcName);
	}
	
	@AfterMethod
	//ITesetResult is a interface or listerner which is cumng from org.tsetng it contains testcase result inforamtion
	public void afterTcExection(ITestResult result) throws IOException {
		 tcName=result.getName();
	//System.out.println("Test case exection is completed");
		if(result.getStatus()==ITestResult.SUCCESS) {
			//System.out.println("Testcase passed:"+result.getName());
			System.out.println("Testcase passed:"+tcName);
			Extenttest.log(LogStatus.PASS, "Testcase passed:"+tcName);
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Testcase failed:"+result.getName());
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			System.out.println("Testcase failed so taking screnshot and the exception info is:"+result.getThrowable());
			File image=takescreenshot.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".jpeg"));
			FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg"));
			ScreenShotUtility.takescreenshot(tcName,result.getThrowable().toString());
			Extenttest.log(LogStatus.FAIL, "Testcase failed:"+result.getName());
			Extenttest.log(LogStatus.FAIL, result.getThrowable().toString());
			
			
		}else if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("Testcase skipped:"+result.getName());
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			System.out.println("Testcase skiped so taking screnshot and the exception info is:"+result.getThrowable());
			File image=takescreenshot.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".jpeg"));
			FileUtils.copyFile(image, new File(System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg"));
		
			ScreenShotUtility.takescreenshot();
			Extenttest.log(LogStatus.SKIP, "Testcase skipped:"+result.getName());
			Extenttest.log(LogStatus.SKIP, result.getThrowable().toString());
		}

extentreport.endTest(Extenttest);
extentreport.flush();
	}
	
	
	public void closeReports() {
		if(extentreport!=null) {
			extentreport.close();
			Extenttest.log(LogStatus.PASS, "Testcase completed and closed");
		}else {
			//throw exception
		System.out.println("Extentreports poinitng to null");	
		}
	}
	
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}
	
	
	@BeforeTest
	public void initReport() {
	 extentreport=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\reports.html");
	 Map<String , String> map= new HashMap<String,String>();
		map.put("HI", "HELLO");
		map.put("JAVA", "SELENIUM");
		map.put("HARDWORK", "JOB");
		extentreport.addSystemInfo(map);

	}
	
	
	//gettermethod to access webdriver object
	public static WebDriver getdriver() {
		return driver;
		
	}
	
	
	public static String getTcName() {
		return tcName;
	}
	
	
	
	public static ExtentTest getExtenttest() {
		return Extenttest;
	}
	
	
	@AfterSuite
	public void CloseBrowser() throws FrameworkException {
		if(driver!=null) {
			driver.close();	
		}else {
			//throw exception
			System.out.println("driver is poiniting to null");
			FrameworkException exception=new FrameworkException("driver is poiniting to null");
			throw exception;
		}

	}
	
}
