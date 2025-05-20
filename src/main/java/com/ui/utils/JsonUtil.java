package com.ui.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import com.ui.pojos.Config;
import com.ui.pojos.Environment;

public class JsonUtil {
	
	
	public static String fetchValue() {
		
		Gson gson = new Gson();
		FileReader freader =null;
		try {
			freader = new FileReader(new File
					(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.json"));
			
			 
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		Config config = gson.fromJson(freader, Config.class);
		 Environment environment = config.getEnvironments().get("QA");
		 return environment.getUrl();
		 
	}

}
