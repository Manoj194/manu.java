package Resturant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;

public class PetchMultipleData {
@Test
public void PetchMultipleData1() throws EncryptedDocumentException, IOException
{
ExcelUtility ExcelUtility = new ExcelUtility();
ExcelUtility.OpenExcel(Iconstantpath.EXCELPATH);
ExcelUtility.GetMultipledata("trip");
}
	
}
