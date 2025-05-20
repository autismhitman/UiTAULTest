package com.ui.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojos.User;

public class ExcelUtil {
	
	
	public static Iterator<User> readExcelData(String fileName) {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\"+fileName);
		XSSFWorkbook wb=null;
		XSSFSheet sh;
		Row row;
		Iterator<Row> rows;
		User userData;
		Cell emailCell;
		Cell pwdCell;
		List<User> userList = null;
		try {
			wb = new XSSFWorkbook(file);
			sh = wb.getSheet("LoginData");
			rows= sh.iterator();
			rows.next();
			
			userList= new ArrayList<>();
			while(rows.hasNext()) {
				row=rows.next();
			 	emailCell = row.getCell(0);
			 	pwdCell = row.getCell(1);
				userData = new User(emailCell.toString(), pwdCell.toString());
				userList.add(userData);
			}
			
		} catch (InvalidFormatException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		
		return userList.iterator();
	}

}
