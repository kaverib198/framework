package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broswertest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Nov830pm\\Framework\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//driver.findElement(By.partialLinkText("Gmail")).click();
		driver.findElement(By.xpath("[//div[@class='gb_q gb_r']/a[contains(text(),'Gmail')]]")).click();
	
		
		

	}

}
