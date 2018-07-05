package utilities;

import org.apache.log4j.Logger;

public class log {
	//public static Logger Log=Logger.getLogger(log.class.getName());
	public static Logger Log=Logger.getLogger(log.class.getName());
	
	public static void statCase(String message) {
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("++++++++++"+ message + "++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
	}
	
	public static void endCase() {
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++END+++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
	}
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void error(String message) {
		Log.error(message);
	}
	
	
}
