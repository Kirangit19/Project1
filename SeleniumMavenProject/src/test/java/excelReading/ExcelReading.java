package excelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	@Test
	public void readSheetDetails() throws Exception {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
//	  WorkBook
		Workbook book = new XSSFWorkbook(fis);
		int sheetNo = book.getNumberOfSheets();
		System.out.println("Number of sheet " + sheetNo);
//	  for(int i=0;i<sheet;i++) {
//		  String sheetname=book.getSheetName(i);
//		  System.out.println(sheetname);
//	  }
		Sheet sheet = book.getSheet("Sheet1");
	}

	@Test
	public void getRowDetails() throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(fis);
//	  Sheet
		Sheet sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count : " + rowcount);
//	  Row
		Row row = sheet.getRow(1);
	}

	@Test
	public void getCellDetails() throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(fis);
//	  Sheet
		Sheet sheet = book.getSheet("Sheet1");
//	  Row
		Row row = sheet.getRow(1);
		int cellcount = row.getLastCellNum();
		System.out.println("Cell Count : " + cellcount);
		Cell cell = row.getCell(2);
		System.out.println("Row Cell Data: " + cell.getStringCellValue());

		for (int i = 0; i < cellcount; i++) {
			Cell cellcall = row.getCell(i);
			System.out.println(cellcall.getStringCellValue());
		}

	}

	@Test
	public void getCellData() throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(fis);
//	  Sheet
		Sheet sheet = book.getSheet("Sheet1");
//	  Row
		Row row = sheet.getRow(1);

		int cellcount = row.getLastCellNum();
		System.out.println("Cell Count : " + cellcount);

		for (int i = 0; i < cellcount; i++) {
			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {

			case (Cell.CELL_TYPE_STRING):
				System.out.println("Cell Data : " + cell.getStringCellValue());
				break;
			case (Cell.CELL_TYPE_NUMERIC):
				System.out.println("Cell Data : " + cell.getStringCellValue());
				break;
			case (Cell.CELL_TYPE_BOOLEAN):
				System.out.println("Cell Data : " + cell.getStringCellValue());
				break;
			default:
				System.out.println("Invalid cell details ");
				break;
			}

		}

	}

}
