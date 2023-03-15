package com.kavya.utilities;

import java.io.File;
import java.io.IOException;

import com.kavya.supporters.ExcelReader;
import com.kavya.supporters.PropertiesReader;
import com.kavya.supporters.TextReader;


public class PojoReader {
	
	public static PropertiesReader getconfProbj() throws IOException 
	{
		PropertiesReader prcof=new PropertiesReader(FilePaths.confFilepath);	
		return prcof;	
	}
	
	public static PropertiesReader getORProbj() throws IOException 
	{
		PropertiesReader pror=new PropertiesReader(FilePaths.ORFilepath);	
		return pror;	
	}
	
	
	public static ExcelReader getExcelReader() throws IOException {
		
		ExcelReader  excelReader= new ExcelReader(FilePaths.excelFilepath);
		return excelReader;
		
	}
	
	
	
	public static TextReader getTextReader() throws IOException {
		TextReader textreader = new TextReader(FilePaths.textFilepath);
		return textreader;
	}
}
