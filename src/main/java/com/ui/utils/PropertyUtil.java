package com.ui.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.ui.constants.Env;

public class PropertyUtil {
	
	private static Properties properties;
	
	public static String  readValue(Env env, String property) {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\"+env+".properties");
		try (FileReader freader = new FileReader(file)) {
			properties= new Properties();
			properties.load(freader);
			
			
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		return properties.getProperty(property.toLowerCase());
		
	}
	
	 

}
