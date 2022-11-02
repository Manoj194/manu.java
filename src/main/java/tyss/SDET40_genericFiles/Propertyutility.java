package tyss.SDET40_genericFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.internal.PropertiesFile;

public class Propertyutility {
	public String GetDataFromPropertFile(String key) throws IOException
	{
	FileInputStream fis= new FileInputStream("./src/test/resources/File.property");
	Properties property=new Properties();
	property .load(fis);
	String data=property.getProperty("UN");
	System.out.println(data);
	return data;
	}
	
}
