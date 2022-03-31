package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static  void  particular_Celldata() throws IOException {
		
		File f = new File("C:\\Users\\suresh\\March22_PB\\Dummy Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Sheet1");
		
		Row r = s.getRow(4);
		
		Cell c = r.getCell(0);
		
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
			
		} else if (type.equals(CellType.NUMERIC)) {
			double value = c.getNumericCellValue();
			int convert = (int) value;
			System.out.println(convert);
			
		} 
			wb.close();
			fis.close();
		}
	public static void main(String[] args) throws IOException {
		
		 particular_Celldata();
		
	}
}	
		


