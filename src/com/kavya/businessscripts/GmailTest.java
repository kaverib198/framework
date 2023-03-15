package com.kavya.businessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kavya.base.BaseTest;
import com.kavya.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest{

	@Test
	public void gmailTest() throws IOException {
		//String cellvalue="";
		//BaseTest.getdriver().get("https://www.gmail.com"); without using this we can extend it
		
		/*//basic level of geting url from config file 22,23,24,26,27
		//getting url from config.propeties
		FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\Config.properties");
		Properties procof=new Properties();
		procof.load(fip);
		
		String qa_urlvalue=procof.getProperty("qa_url");
		getdriver().get(qa_urlvalue);
*/
		
		//advanced level of geting url frm config file by using propertiesreader and pojoreader
	String url=	PojoReader.getconfProbj().getValue("qa_url");
	getdriver().get(url);
	getExtenttest().log(LogStatus.PASS, "Browser is opened"+url);
	
	/*//geting data from excel basic style
	FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
Workbook workbook=	WorkbookFactory.create(fip);
Sheet sheet=workbook.getSheet("realtime");
Row row=sheet.getRow(0);
Cell cell= row.getCell(0);
if(cell.getCellType()==CellType.STRING) {
	 cellvalue=cell.getStringCellValue();	
}else if(cell.getCellType()==CellType.NUMERIC) {
	 cellvalue=cell.getNumericCellValue()+"";
}
System.out.println("USER NAME CELLVALU DATA IS:"+""+cellvalue);

		*/
	
	String Undata=PojoReader.getExcelReader().getCelldata("sheetname", "realtime", 0, 0);
		
		//getdriver().get("https://www.gmail.com");
		
		/*//basic styleof getting url from objectrepository file 41,42,43,45,46 by creating object for propertiesfile
		//getting elements locators from obejctrepositry properties
		FileInputStream fip1=new FileInputStream("D:\\Nov830pm\\Framework\\src\\comm\\kavya\\objectRepository\\or.properties");
		Properties proOR=new Properties();
		proOR.load(fip1);
		
	String Un_name=proOR.getProperty("Un_id");
	String Un_next=proOR.getProperty("next_id");	
		*/
	
	
	String Un_name=	PojoReader.getORProbj().getValue("Un_id");
	String Un_next=	PojoReader.getORProbj().getValue("next_id");
	
		WebElement username=getdriver().findElement(By.id(Un_name));
		//WebElement username=getdriver().findElement(By.id("identifier456"));//to fail thecase
		//username.sendKeys(cellvalue);
		username.sendKeys(Undata);//while using excelreader
		//getExtenttest().log(LogStatus.PASS, "DATA Typingactions on username with testdata "+cellvalue);
		getExtenttest().log(LogStatus.PASS, "DATA Typingactions on username with testdata "+Undata);
		WebElement nxt=getdriver().findElement(By.id(Un_next));
		nxt.click();
		getExtenttest().log(LogStatus.PASS, "DATA typing actions by clicking click button ");

	}
}
