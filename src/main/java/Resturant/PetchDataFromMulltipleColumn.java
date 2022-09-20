package Resturant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PetchDataFromMulltipleColumn {

	private static final String String = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/manu194.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Testdata");
		int count = sh.getLastRowNum();
		for(int i=0;i<count;i++)
		{
			Row r = sh.getRow(i);
			String ka = r.getCell(0).getStringCellValue();
			String na = r.getCell(1).getStringCellValue();
			System.out.println(ka+"\t"+na);
			String ka1 = r.getCell(0).getStringCellValue();
			String na2 = r.getCell(1).getStringCellValue();
			System.out.println(ka1+"\t"+na2);
			String ka3 = r.getCell(0).getStringCellValue();
			String na4 = r.getCell(1).getStringCellValue();
			System.out.println(ka3+"\t"+na4);
		
			
			
		}

	}

}
