
package Resturant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PetchTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//step-1 convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/Propertyfile1");
		// step-2 create a object for properties
	Properties property = new Properties();	
	//step-3 Load all the keys	
	property.load(fis);	
	//step-4 fetch the data	
	String url = property.getProperty("numb").trim();	
	String numb = property.getProperty("url").trim();	
	String m = property.getProperty("mail").trim();	
		
	System.out.println(m);	
		
	System.out.println(url);	
	System.out.println(numb);	
		
		

	}

}
