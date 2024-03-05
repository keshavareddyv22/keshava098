package commonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromFile(String key) throws IOException {
		
		String filepath= ".\\src\\test\\resources\\CommonData.txt";
		FileInputStream fin = new FileInputStream(filepath);
		
		Properties pro = new Properties();
		pro.load(fin);
		
		String value = pro.getProperty(key);
		return value;
	}

}
