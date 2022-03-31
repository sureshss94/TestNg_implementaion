package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Towrite_Data {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\suresh\\Documents\\task\\Datawrite.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("user");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Data").getRow(0).createCell(2).setCellValue("Id");
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Suresh");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("45wrd");
		wb.getSheet("Data").getRow(1).createCell(2).setCellValue(101);
		wb.getSheet("Data").createRow(2).createCell(0).setCellValue("makesh");
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("rty67");
		wb.getSheet("Data").getRow(2).createCell(2).setCellValue(102);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();

		
		System.out.println("Process done");
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	

}

 
