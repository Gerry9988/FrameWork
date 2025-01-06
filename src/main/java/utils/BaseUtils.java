package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseUtils {
	public static String getConfigValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
		prop.load(fp);
		
		return prop.getProperty(key);
	}

}
