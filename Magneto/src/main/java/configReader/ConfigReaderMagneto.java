package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderMagneto {
	
	public static Properties properties;
	public static FileInputStream fs;
	
	public static String ReadTheConfigfile(String key) {
		String path="C:\\Users\\User\\Bhiki_AutoMation\\Magneto\\src\\test\\resources\\config.properties";
		try {
			fs=new FileInputStream(path);
			properties=new Properties();
			try {
				properties.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=properties.get(key).toString();
		return value;
	}

}
