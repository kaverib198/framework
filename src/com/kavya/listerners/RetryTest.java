package com.kavya.listerners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryTest {
	
	//@Test(retryAnalyzer=CustomRetry.class) when using customretry using this test with retryanalyer
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Nov830pm\\Framework\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("ideentifier456")).sendKeys("kavya2390@gmail.com");

	}

}
