package commonUtility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * 
 * @author Channakeshava
 *
 */
public class JavaUtility {
	/**
	 * This class is used to create the random number
	 * @return
	 */
	public int getRandomNumber() {
		Random rn = new Random();
		int randomNum = rn.nextInt(500);
		return randomNum;
	}
	/**
	 * This class is used to get the system date and time
	 */
	public String getSystmemDate() {
		String DateAndMonth = LocalDateTime.now().toString().replace(":","-" );
		return DateAndMonth;
	}
	

}
