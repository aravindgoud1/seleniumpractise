package com.datadrivertest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile==>Workbook==>sheets==>Rows==>cells

public class FileInputStreamm {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		short totalCells = sheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCells);
		for (int r = 0; r <= totalRows; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for (int c = 0; c < totalCells; c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString() + "\t");

			}
			System.out.println();
		}
		workBook.close();
		file.close();

	}

}
