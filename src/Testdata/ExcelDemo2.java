package Testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
		Workbook workbook=WorkbookFactory.create(fip);//creating the workbook
		
		Sheet sheet=workbook.getSheetAt(0);
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++) 
			{
				Cell cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING)//here celltype is an enum class
				{
				String cellvalue=	cell.getStringCellValue();
				System.out.println("string cell type:"+""+cellvalue);
				}
				else if(cell.getCellType()==CellType.NUMERIC) 
				{
					double cellvalue=cell.getNumericCellValue();
					System.out.println("number cell type:"+""+cellvalue);
				}else if(cell.getCellType()==CellType.BOOLEAN) 
				{
					boolean cellvalue=cell.getBooleanCellValue();
					System.out.println("Bollean cell type:"+""+cellvalue);
				}
			}
		}
		

	}

}
