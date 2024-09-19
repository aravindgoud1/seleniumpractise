package com.datadrivertest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOutPutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\Book.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Dynamic Data");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want ?");
		int noOfRows = sc.nextInt();
		System.out.println("How many columns you want ?");
		int noOfColumns = sc.nextInt();
		for (int r = 0; r <= noOfRows; r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for (int c = 0; c < noOfColumns; c++) {
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());

			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created...........!!!!");

	}

}
