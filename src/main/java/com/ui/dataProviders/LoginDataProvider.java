package com.ui.dataProviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojos.TestData;
import com.ui.pojos.User;
import com.ui.utils.CsvUtil;
import com.ui.utils.ExcelUtil;

public class LoginDataProvider {
	
	
	@DataProvider(name="loginTestData", parallel=true)
	public Iterator<Object[]> loginDataProvider() {
		
		
		Gson gson = new Gson();
		FileReader freader=null;
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\loginData.json");
		try {
			freader= new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 TestData data = gson.fromJson(freader, TestData.class);
		 
		 List<Object[]> dataToReturn = new ArrayList<Object[]>();
		 for( User user: data.getData()) {
			 
			 dataToReturn.add(new Object[] {user});
		 }
		 
		 return dataToReturn.iterator();
	}
	
	@DataProvider(name="loginTestCSVData")
	public Iterator<User> loginCsvDataProvider(){
		
		  return  CsvUtil.csvReadUtil("loginCsvData.csv");
	}
	
	@DataProvider(name="loginTestExcelData")
	public Iterator<User> loginExcelDataProvider(){
		
		  return  ExcelUtil.readExcelData("loginData.xlsx");
	}

}
