package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static String propertyValue;
	/**
	 * This method is used to get property values from Properties file.
	 * @param key Property key whose value is to be fetched.
	 * @return Value of the key.
	 */

	public static String getProperties(String key){
		try {
			FileInputStream inputStream = new FileInputStream("src/main/resources/PropertyFile.properties");
			Properties propObj = new Properties();
			propObj.load(inputStream);

			propertyValue = propObj.getProperty(key);

			return propertyValue;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
