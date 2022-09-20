package Resturant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;

public class GetMultipledata {

@Test
public void GetMultipledata1() throws EncryptedDocumentException, IOException {
	ExcelUtility excelUtility = new ExcelUtility ();
	excelUtility.OpenExcel(Iconstantpath.EXCELPATH);
	String[][] arr = excelUtility.GetMultipledata("AddingResturant");
for(int i=0;i<9;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.println(arr[i][j]);
	}
}

	
}
}
