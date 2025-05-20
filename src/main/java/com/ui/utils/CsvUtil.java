package com.ui.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojos.User;

public class CsvUtil {
	
   
	public static Iterator<User> csvReadUtil(String fileName) {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\"+fileName);
		FileReader freader=null;
		CSVReader csv;
		String[] line;		
		List<User> userList=null;
		User userData;
		try {
			freader = new FileReader(file);
			csv = new CSVReader(freader);
			csv.readNext();
			
			userList = new ArrayList<>();
			while((line= csv.readNext())!=null) {
				
				 userData = new User(line[0],line[1]);
				 userList.add(userData);
				 
			}
		} 	 
		
		 catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch ( CsvValidationException | IOException e) {
			
			e.printStackTrace();
		}
		
		return userList.iterator();
	}
}
