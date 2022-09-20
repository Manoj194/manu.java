package Resturant;

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

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;

public class PasstheDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String c = new ExcelUtility().WriteToExcel(Iconstantpath.EXCELPATH,"Testdata",7,5);
		//c.setCellValue("Royal manu");
	/*	FileInputStream fis=new FileInputStream("./src/test/resources/manu777.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Testdata");
		Row r = sheet.getRow(7);
		Cell c = r.createCell(5);
		c.setCellValue("Royal manu");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/manu777.xlsx");
		wb.write(fos);*/
		System.out.println("data update succesfully");

	}

	
}
