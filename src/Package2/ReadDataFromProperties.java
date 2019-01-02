package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	
	
	public static void main(String[] args) {
		
		
		File file=new File("/home/tyss/Desktop/datafile.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
