package tyss.SDET40_genericFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook workbook;

	public String getDataFromExcl(String EXCELPATH, String sheetname, int rownum, int cellnum) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(EXCELPATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet page = workbook.getSheet(sheetname);
		String data = new DataFormatter().formatCellValue(page.getRow(rownum).getCell(cellnum));
		try {
			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}

	/**
	 * This method used to write the data to excel
	 * 
	 * @return
	 * @Manoj
	 */

	public String WriteToExcel(String EXCELPATH, String sheetname, int rownum, int cellnum) {
		FileOutputStream fis1 = null;
		try {
			fis1 = new FileOutputStream(Iconstantpath.EXCELPATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String sheetname1 = null;
		Sheet sheet = workbook.getSheet(sheetname);
		int rownum1 = 0;
		Row row = sheet.getRow(rownum1);
		int cellnum1 = 0;
		Cell cell = row.createCell(cellnum1);

		try {
			workbook.write(fis1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sheetname1;
	}

	/**
	 * This Method use to fetch the data from excel and stored in excel
	 * 
	 * @param string
	 * @param string
	 */
	public Map<String, String> GetDataFromExcel(String sheetname) {
		Sheet sheet = workbook.getSheet(sheetname);
		Map<String, String> map = new HashMap<>();
		DataFormatter df = new DataFormatter();
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
		}

		return map;
	}

	/*
	 * This method used for open the excel
	 * 
	 */
	public void OpenExcel(String EXCELPATH) throws EncryptedDocumentException, IOException {
	// String EXCELPATH = null;
		FileInputStream fis = new FileInputStream(EXCELPATH);
		workbook = WorkbookFactory.create(fis);

	}

	/**
	 * This method used for petch the data from excel based on key
	 * 
	 * @param sheetname
	 * @param requiredkey
	 * @return
	 */
	public String getDatafromExcel(String sheetname, String requiredkey) {
		Sheet sheet = workbook.getSheet(sheetname);
		String value = null;
		for (int k = 0; k <= sheet.getLastRowNum(); k++) {
			String actulkey = sheet.getRow(k).getCell(0).getStringCellValue();
			if (actulkey.equalsIgnoreCase(requiredkey)) {
				value = sheet.getRow(k).getCell(1).getStringCellValue();
				break;
			}

		}
		return value;

	}

	/**
	 * This method is used to fetch the data from excel and stored in Map
	 * 
	 * @param sheetName
	 * @return
	 */
	public Map<String, String> getDataFromExcelInMap(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);
		Map<String, String> map = new HashMap<>();
		DataFormatter df = new DataFormatter();
		for (int i = 0; i <=sheet.getLastRowNum(); i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
		return map;
	}

	public Map<String, String> getDataFromExcelInMap1(String sheetName1) {
	Sheet sheet = workbook.getSheet(sheetName1);
		Map<String, String> map = new HashMap<>();
		DataFormatter df = new DataFormatter();
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
		return map;
	}

	// Data Provider
	/**
	 * This method used for getMultiple Data
	 * @param sheetname
	 * @return
	 */
	public String[][] GetMultipledata(String sheetname) {
		Sheet sheet = workbook.getSheet(sheetname);
		DataFormatter df = new DataFormatter();
		String[][] arr = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				arr[i - 1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return arr;
	}
}
