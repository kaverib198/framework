package Testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatatoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip =new FileInputStream("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
Workbook workbook=WorkbookFactory.create(fip);
Sheet sheet=workbook.getSheetAt(0);

Row row1=sheet.createRow(1);
Cell cell14=row1.createCell(4);
cell14.setCellValue("Hardwork");


Row row10=sheet.createRow(10);
Cell cell100=row10.createCell(0);
cell100.setCellValue("JOB");





//for storing data to the excel
FileOutputStream fop=new FileOutputStream("D:\\Nov830pm\\Framework\\src\\Testdata\\Testdata.xlsx");
workbook.write(fop);

	}

}
