package basicdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.kavya.base.ActionEgine;
import com.kavya.base.BaseTest;

//*****INTERVIEW QUESTION ******** how wil to upload a file ;if the webelemet is haveing type=file then by using sendkeys or  we can upload it by using autoit

//two types of popup 1.web-based popup==>selenium can handle web based popup 2.windowbased popup==>autioIt,sikuli
//confirmation popup,prompt popup==requires crediantials ,alert popup,windowbased popup

//some are inspectable popups some are not inspetable popups ,if it is non-inspectable popup then wh have to switch to alert
//Alert is an interface which is specially designed to handle popups
//accept,dismiss,getstring,authenticateusing() methods in alert

public class PopupDemo extends BaseTest{
	
	public void popupTest() {
		ActionEgine.navigatetoUrl("");
		getdriver().findElement(By.xpath(""));
	Alert alert=	getdriver().switchTo().alert();
	
	//Runtime.getRuntime().exec("location of popup");//used to execute autoit prgm frm java
	
	String textofalert=alert.getText();
	System.out.println(textofalert);
	alert.sendKeys("KAVYA");
	alert.accept();
		
	}

}
