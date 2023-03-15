package com.kavya.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.kavya.base.BaseTest;

public interface ScreenShotUtility {
	
	public static String takescreenshot() throws IOException {
		TakesScreenshot takescreenshot=(TakesScreenshot)BaseTest.getdriver();
		//System.out.println("Testcase failed so taking screnshot and the exception info is:"+result.getThrowable());
		File image=takescreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath=System.getProperty("user.dir")+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(image, new File(imagepath));
		return imagepath;
	}
	
	public static String takescreenshot(String tcName,String exceptionmsg) throws IOException {
		TakesScreenshot takescreenshot=(TakesScreenshot)BaseTest.getdriver();
		System.out.println("Testcase failed"+tcName+" so taking screnshot and the exception info is:"+exceptionmsg);
		File image=takescreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath=System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg";
		FileUtils.copyFile(image, new File(imagepath));
		return imagepath;		
	}

}
