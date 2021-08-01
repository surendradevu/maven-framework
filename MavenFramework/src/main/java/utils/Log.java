package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	
	//Start test and End test
	
	static{
		String log4jPath = System.getProperty("user.dir")+"/src/main/java/resources/log4j.xml";
		System.setProperty("logoutputpath", System.getProperty("user.dir"));
		System.setProperty("log4j.configurationFile", log4jPath);
	}
	
	public static Logger Log=LogManager.getLogger(Log.class.getName());
	
	
	
	public static void startTestCase(String sTestCaseName) {
		Log.info("***************************************");
		Log.info(sTestCaseName);			
		Log.info("***************************************");
	}
	public static void EndTestCase(String sTestCaseName) {
		Log.info("**********"+sTestCaseName+"************");
	}
	
	
	//Log level methods
	public static void info(String message) {
		Log.info(message);
	}
	public static void warn(String message) {
		Log.warn(message);
	}
	public static void error(String message) {
		Log.error(message);
	}
	public static void fatal(String message) {
		Log.fatal(message);
	}
	

}
