package com.kavya.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kavya.base.BaseTest;
import com.kavya.utilities.PojoReader;

public class InstasTest extends BaseTest{
	
	@Test
	public void instasTest() throws IOException {
		//getdriver().get("https://www.rameshsoft.com");
		//getdriver().findElement(By.id("Indetfirer"));
		
		
		//Basic style
	/*	//getting url from config.propeties
				FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\Config.properties");
				Properties procof=new Properties();
				procof.load(fip);
				
				String inst_urlvalue=procof.getProperty("inst_url");
				getdriver().get(inst_urlvalue);
	*/			
				
				//Advanced style
				String url=PojoReader.getconfProbj().getValue("inst_url");
				getdriver().get(url);
			
		
	}

}
