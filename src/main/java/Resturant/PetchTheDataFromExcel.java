package Resturant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.mysql.cj.result.Row;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
//import tyss.SDET40_genericFiles.Iconstantpath.iconstantceutility;

public class PetchTheDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
 ExcelUtility ExcelUtility = new ExcelUtility();
		String manoj = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",0,1);
		System.out.println(manoj );
		//FileInputStream fis = new FileInputStream("./src/test/resources/manu777.xlsx");
	//	Workbook wb = WorkbookFactory.create(fis);
	//	org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Testdata");
		//org.apache.poi.ss.usermodel.Row r = sheet.getRow(0);
		//org.apache.poi.ss.usermodel.Cell c = r.getCell(1);
		
		//String manu = c.getStringCellValue();
		
		//System.out.println(manu);
		
		//wb.close();
	}
}
