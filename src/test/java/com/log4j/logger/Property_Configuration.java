package com.log4j.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.Property;

public class Property_Configuration {
	
	static Logger log = Logger.getLogger(Property_Configuration.class);

	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("fatal");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
