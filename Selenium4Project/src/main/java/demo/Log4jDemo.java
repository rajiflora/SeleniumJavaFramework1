package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static private Logger logger=LogManager.getLogger(Log4jDemo.class); 
			
	public static void main(String[] args) {
		System.out.println("\n Hello World! \n");
		logger.trace("This is an Trace Log");
		logger.info(" This is an Info log");
		logger.error("This is an Error log");
		logger.warn("This is an Warning log");
		logger.fatal("This is a Fatal log");
		System.out.println("\n Completed");
	}

}
