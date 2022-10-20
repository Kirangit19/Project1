package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	// Constructor
	public ReadConfig() {
		try {
			FileInputStream fis=new FileInputStream(".\\Configuration\\Config.properties");
			properties=new Properties();
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		String value= properties.getProperty("baseUrl");
		if(value != null)
			return value;
		else
		     throw new RuntimeException("Url is not specified");
	}
	
	public String getBrowser() {
		String value= properties.getProperty("browser");
		if(value != null)
			return value;
		else
			throw new RuntimeException("Url is not specified");
	}
	

}
