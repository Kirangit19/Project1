package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static FileInputStream fileInputstream;
	private static Workbook wbook;

	public static Workbook initializewbook(String filePath) {
		try {
			fileInputstream = new FileInputStream(filePath);
			return new XSSFWorkbook(fileInputstream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int getrowcount(String filePath, String sheetname) {
		wbook = initializewbook(filePath);
		return wbook.getSheet(sheetname).getLastRowNum();
	}

	public static int getcellcount(String filePath, String sheetname, int rowNum) {
		wbook = initializewbook(filePath);
		return wbook.getSheet(sheetname).getRow(rowNum).getLastCellNum();
	}

	public static String getCellValue(String filePath, String sheetname, int rowNum, int cellNum) {
		wbook = initializewbook(filePath);
		Cell cell = wbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum);
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return cell.getStringCellValue();
		case BLANK:
			return cell.getStringCellValue();
		default:
			throw new RuntimeException("There is no support for this type of cell ");
		}
	}

	public static void updateExcel(String filePath, String sheetname, int rowNum, int cellNum, String input) {
		wbook = initializewbook(filePath);
		Cell cell = wbook.getSheet(sheetname).getRow(rowNum).createCell(cellNum);
		cell.setCellValue(input);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
			wbook.write(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
