package utils;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

	//Read values from properties file
	
	static Properties properties;
	String pFileName="";
	
	public PropertyReader()
	{
		loadAllProperties();
	}
	
	//Load file from resources
	public void loadAllProperties()
	{
		properties=new Properties();
		try {
			
			pFileName= System.getProperty("user.dir")+"/src/main/java/resources/test_config.properties";
			properties.load(new FileInputStream(pFileName));
			}catch(Exception e) { System.out.println(e);
			throw new RuntimeException("File not found:"+pFileName);
			}
	}
	
	public static String readItem(String propertyName) {
		return properties.getProperty(propertyName);
	}
}
