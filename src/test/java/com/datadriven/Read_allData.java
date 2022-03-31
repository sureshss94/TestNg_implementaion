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

public class Read_allData {

	public static void get_Alldata() throws IOException {

		File f = new File("C:\\Users\\suresh\\March22_PB\\Dummy Excel.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {
					String cellValue = c.getStringCellValue();

					System.out.println(cellValue);

				} else if (type.equals(CellType.NUMERIC)) {
					double cellValue = c.getNumericCellValue();

					int v = (int) cellValue;
					String value = Integer.toString(v);
					System.out.println(value);

				}

			}

		}
		wb.close();

	}
	public static void main(String[] args) throws IOException {
		get_Alldata();
	}

}
