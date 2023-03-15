package basicdemos;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nov830pm\\Framework\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.adp.com");
		
		
		//as we are using remotewebdriver as reference we have direct getscreenshot method if we use webdriver as refernce then we need to craete an object an typecast it
		//File file=driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File( "D:\\Nov830pm\\Framework\\Screenshots\\adphomepage.jpg"));
		
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File file=takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File( "D:\\Nov830pm\\Framework\\Screenshots\\adphomepage.jpg"));
		
		driver.get("https://www.gmail.com");
		File file1=takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1,new File( "D:\\Nov830pm\\Framework\\Screenshots\\gmailhomepage.jpg"));
		
		driver.close();
		
		

	}

}
