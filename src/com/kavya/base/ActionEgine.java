package com.kavya.base;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEgine extends BaseTest{
private	static WebElement webelement;
private	static List<WebElement> elements;


	public static void enterUrl(String url) {
		try {
			getdriver().get(url);
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
			} catch (Exception e) {
			getExtenttest().log(LogStatus.FAIL, "Url is  not entered as"+url);
		}
		
	}
	public static void navigatetoUrl(URL url) {
		try {
			getdriver().navigate().to(url);;
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
		} catch (Exception e) {
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
		}

	}
	
	public static void navigatetoUrl(String url) {
		try {
			getdriver().navigate().to(url);;
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
		} catch (Exception e) {
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
		}

	}
	public static void enterUrlJs(String url) {
		try {
			getdriver().get(url);
			getExtenttest().log(LogStatus.PASS, "Url is entered as"+url);
			} catch (Exception e) {
			getExtenttest().log(LogStatus.FAIL, "Url is  not entered as"+url);
		}
		
	}
	
	public static WebElement identifyElement(String how,String howvalue) {
		switch (how) {
		case "id":webelement=getdriver().findElement(By.id(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
			break;
		case "name":webelement=getdriver().findElement(By.name(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "className":webelement=getdriver().findElement(By.className(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "tagName":webelement=getdriver().findElement(By.tagName(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "xpath":webelement=getdriver().findElement(By.xpath(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "partialLinkText":webelement=getdriver().findElement(By.partialLinkText(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "linkText":webelement=getdriver().findElement(By.linkText(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		case "cssSelector":webelement=getdriver().findElement(By.cssSelector(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified element with"+how);
		break;
		}
		return webelement;

	}
	
	public static List<WebElement> identifyElements(String how,String howvalue) {
		switch (how) {
		case "id":elements=getdriver().findElements(By.id(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
			break;
		case "name":elements=getdriver().findElements(By.name(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "className":elements=getdriver().findElements(By.className(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "tagName":elements=getdriver().findElements(By.tagName(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "xpath":elements=getdriver().findElements(By.xpath(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "partialLinkText":elements=getdriver().findElements(By.partialLinkText(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "linkText":elements=getdriver().findElements(By.linkText(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		case "cssSelector":elements=getdriver().findElements(By.cssSelector(howvalue));
		getExtenttest().log(LogStatus.PASS, "identified elements with"+how);
		break;
		}
		return elements;
	
	}
	
	
	
	public static void DTA(WebElement webelement,String testData,WebElement webelementName) {
		
try {
	Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
	getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
	webelement.clear();
	getExtenttest().log(LogStatus.PASS, "Webelement is"+webelementName+ "cleared");
	webelement.sendKeys(testData);
	getExtenttest().log(LogStatus.PASS, " Data typing action is done on Webelement "+webelementName+ "wit testdata is"+testData);
	
} catch (Exception e) {
	getExtenttest().log(LogStatus.FAIL, "Webelement is:"+webelementName +"not displayed and enabled");	
}
	}
	
	//not writern
	public static void DTAJs(WebElement webelement,String testData,WebElement webelementName) {
		
		try {
			Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
			getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
			webelement.clear();
			getExtenttest().log(LogStatus.PASS, "Webelement is"+webelementName+ "cleared");
			webelement.sendKeys(testData);
			getExtenttest().log(LogStatus.PASS, " Data typing action is done on Webelement "+webelementName+ "wit testdata is"+testData);
			
		} catch (Exception e) {
			getExtenttest().log(LogStatus.FAIL, "Webelement is:"+webelementName +"not displayed and enabled");	
		}
			}
	
	
public static void DTAByActions(WebElement webelement,String testData,WebElement webelementName) {
		
		try {
			Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
			getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
			Actions actions=new Actions(getdriver());
			actions.sendKeys(webelement, testData).build().perform();
		getExtenttest().log(LogStatus.PASS, " Data typing action is done on Webelement "+webelementName+ "wit testdata is"+testData);
			
		} catch (Exception e) {
			getExtenttest().log(LogStatus.FAIL, "Webelement is:"+webelementName +"not displayed and enabled");	
		}
			}
	
	
//another approach	
public static void DTAByActionsOne(WebElement webelement,String testData,WebElement webelementName) {
	
	try {
		Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
		getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
		Actions actions=new Actions(getdriver());
		actions.click(webelement).sendKeys(testData).build().perform();
	getExtenttest().log(LogStatus.PASS, " Data typing action is done on Webelement "+webelementName+ "wit testdata is"+testData);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "Webelement is:"+webelementName +"not displayed and enabled");	
	}
		}
	
	
	
public static void click(WebElement webelement,WebElement webelementName) {
	
	try {
		Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
		getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
		webelement.click();
	getExtenttest().log(LogStatus.PASS, " clicked on webelemet Webelement "+webelementName);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "NOt clicked Webelement is:"+webelementName +"not displayed and enabled");	
	}
		}

public static void clickJs(WebElement webelement,WebElement webelementName) {
	
	try {
		Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
		getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
		webelement.click();
	getExtenttest().log(LogStatus.PASS, " clicked on webelemet Webelement "+webelementName);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "NOt clicked Webelement is:"+webelementName +"not displayed and enabled");	
	}
		}



public static void clickbyActions(WebElement webelement,WebElement webelementName) {
	
	try {
		Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
		getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
		Actions actions=new Actions(getdriver());
		actions.click(webelement).build().perform();
	getExtenttest().log(LogStatus.PASS, " clicked on webelemet Webelement "+webelementName);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "NOt clicked Webelement is:"+webelementName +"not displayed and enabled");	
	}
		}

public static void clickbyActionsOne(WebElement webelement,WebElement webelementName) {
	
	try {
		Assert.assertTrue(webelement.isDisplayed() && webelement.isEnabled());
		getExtenttest().log(LogStatus.PASS, "Webelement is:"+webelementName +" displayed and enabled");
		Actions actions=new Actions(getdriver());
		actions.doubleClick(webelement).build().perform();
	getExtenttest().log(LogStatus.PASS, " clicked on webelemet Webelement "+webelementName);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "NOt clicked Webelement is:"+webelementName +"not displayed and enabled");	
	}
		}


public void handleDropdowns(WebElement dropdown,String how,String howvalue,WebElement dropdownName) {
	try {
		Assert.assertTrue(dropdown.isDisplayed() && dropdown.isEnabled());
		getExtenttest().log(LogStatus.PASS, "dropdown is:"+dropdownName +" displayed and enabled");
		Select select=new Select(dropdown);
		if(how.equalsIgnoreCase("value")) {
			select.selectByValue(howvalue);
		}else if(how.equalsIgnoreCase("text")){
			select.selectByVisibleText(howvalue);
		}else if(how.equalsIgnoreCase("value")){
			int index=Integer.parseInt(howvalue);
			select.selectByIndex(index);
		}	
	getExtenttest().log(LogStatus.PASS, " clicked on dropdown Webelement "+dropdownName);
		
	} catch (Exception e) {
		getExtenttest().log(LogStatus.FAIL, "NOt clicked Webelement is:"+dropdownName +"not displayed and enabled");	
	}
		}


//approach 1
public void handleWindow() {
	String currentWidow=getdriver().getWindowHandle();
	Set<String> allwindows=getdriver().getWindowHandles();
	getExtenttest().log(LogStatus.PASS, "All windows are"+allwindows);
	for(String str:allwindows) {
		if(!str.equalsIgnoreCase(currentWidow)) {
			getdriver().switchTo().window(str);
			getExtenttest().log(LogStatus.PASS, "window is switched"+""+str);
		}}
		
	}
	
	
	
	//appoarch2 by index easy for window handleing
	public void handleWindowone(int index) {
		try {
		Set<String> allwindows=getdriver().getWindowHandles();
		getExtenttest().log(LogStatus.PASS, "All windows are"+allwindows);
		List<String> listwindows=new ArrayList<String>(allwindows);
		String windowName=listwindows.get(index);
		getdriver().switchTo().window(windowName);
				getExtenttest().log(LogStatus.PASS, "window is switched"+""+windowName);
		}
		catch(Exception e) {
			
		}
			
		}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
























	

