package com.wipro.demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo {

	public static void main(String[] args) {

		
			// ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF

			//Logger logger =	Logger.getLogger("Demo");
		PropertyConfigurator.configure("log4j.properties");
		
		
		Logger logger =	Logger.getLogger(Demo.class);
			
		
				//logger.addAppender(new ConsoleAppender());
					
		
							
		
					//logger.setLevel(Level.DEBUG);
					logger.info("This is Info Log");
					logger.warn("This is Warning Log");
					logger.debug("This is Debug log");
					logger.error("This is Error log");
					logger.fatal("This is Fatal log");
					
					
					
				
			

	}

}
