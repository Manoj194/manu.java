


package tyss.SDET40_genericFiles;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
/*
 * This method use to genarate random number
 * author manoj
 */
	public int RandomNumber(int limit) {
		return new Random().nextInt(limit);
	}
	
	/*
	 * This method  used to convert the current date and time into "dd_MM_YYY_hh_mm_sss"
	 */
	public String CurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
		String actualDate=sdf.format(date);
		return actualDate;
		
	}

	}


