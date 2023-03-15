package com.kavya.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	private String filepath;
	private FileInputStream fileinputstream;
	private Workbook workbook;
	private Sheet sheet;
	private int rowcount;
	private Row row;
	private Cell cell;
	private String cellData;

	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath=filepath;
		 fileinputstream=new FileInputStream(filepath);
		 workbook=WorkbookFactory.create(fileinputstream);	
	}
	
	public Sheet getSheetobj(String how,String howvalue) {
		if(workbook!=null) {
			if(how.equalsIgnoreCase("sheetName")) {
				 sheet=workbook.getSheet(howvalue);
			}else if(how.equalsIgnoreCase("index")) {
				int indx=Integer.parseInt(howvalue);
				 sheet=	workbook.getSheetAt(indx);
				
			}else {
				//throws exception
				System.out.println("excel pointing to null");
			}
		}
		
		return sheet;
	}
	public int getTotalrowcount(String how,String howvalue) {
		sheet=getSheetobj(how , howvalue);
		if(sheet!=null) {
	 rowcount=	sheet.getLastRowNum();
	}
		else {
			//throw exception
			System.out.println("NULL");
		}
		return rowcount;                                           
	}
	
	
	
	public String getCelldata(String how,String howvalue,int rowNum,int cellNum) {
		sheet=getSheetobj(how, howvalue);
		if(sheet!=null) {
			row = sheet.getRow(rowNum);
			if(row!=null) {
				cell=row.getCell(cellNum);
				if(cell!=null) {
					if(cell.getCellType()==CellType.STRING){
					 cellData=	cell.getStringCellValue();
					}
					else if(cell.getCellType()==CellType.NUMERIC) {
						 cellData=cell.getNumericCellValue()+"";
						}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						 cellData=cell.getBooleanCellValue()+"";	
					}
				}	
				else {
					System.out.println("Cell is pointing to null");
				}
			}
		else {
				System.out.println("Row is pointing to null");
			}}
			else {
				System.out.println("Sheet is pointing to null");
			}
		
		return cellData;
		}	
	
	
	
	
	
	public List<String> getTotalSheetdata(String how,String howvalue) {
		
		List<String> excelData=new ArrayList<>();
		sheet=getSheetobj(how, howvalue);
		if(sheet!=null) {
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				row=sheet.getRow(i);
				for(int j=0;j<=row.getLastCellNum();j++) {
					cell=row.getCell(j);
					if(cell.getCellType()==CellType.STRING)//here celltype is an enum class
					{
					 cellData=	cell.getStringCellValue();
					excelData.add(cellData);
					}
					else if(cell.getCellType()==CellType.NUMERIC) 
					{
						 cellData=cell.getNumericCellValue()+"";
						 excelData.add(cellData);
						
					}else if(cell.getCellType()==CellType.BOOLEAN) 
					{
						 cellData=cell.getBooleanCellValue()+"";
						 excelData.add(cellData);
						
					}
				}	
				}	
			}
		else {
			System.out.println("pointing to null");
		}
		return excelData;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
