package Testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
		
		//File file = new File("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
		//FileInputStream fileInputStrem = new FileInputStream(file);
		
		//workbook is an interface
		Workbook workbook=WorkbookFactory.create(fip);//workbookfactory is a class which is cumng frm apchepoi n it has sataticmethod create to get the workbook of excel sheet
		
		Sheet sheet=workbook.getSheet("Gmail");
		//Sheet sheet =workbook.getSheetAt(0);
		
		int Numb_row=sheet.getLastRowNum();
		System.out.println("no of rows in sheet:"+""+Numb_row);
		
		Row row0=sheet.getRow(0);
		int cellcount0throw=row0.getLastCellNum();
		System.out.println("0Th row0Th column count is:"+cellcount0throw);
		
		Cell cell00=row0.getCell(0);
		String cell00value=cell00.getStringCellValue();
		System.out.println("cell values in 0th row and 0th column:"+cell00value);
		
		Cell cell01=row0.getCell(1);
		String cell01value=cell01.getStringCellValue();
		System.out.println("cell values in 0th row and 1st column:"+cell01value);
		
		Cell cell02=row0.getCell(2);
		String cell02value=cell02.getStringCellValue();
		System.out.println("cell values in 0th row and 2nd column:"+cell02value);
		
		
		
		
		Row row1=sheet.getRow(1);
		int cellcount1strow=row1.getLastCellNum();
		System.out.println("1st row 1st column count is:"+cellcount1strow);
		
		Cell cell10=row1.getCell(0);
		String cell10_value=cell10.getStringCellValue();
		System.out.println("cell values in 1st row and 0th column:"+cell10_value);
		
		Cell cell11=row1.getCell(1);
		double cell11_value=cell11.getNumericCellValue();
		System.out.println("cell values in 1st row and 1at column:"+cell11_value);
	}

}
