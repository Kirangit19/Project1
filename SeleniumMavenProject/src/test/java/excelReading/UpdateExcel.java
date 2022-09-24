package excelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UpdateExcel {

	@Test
	public void updateExcel() throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(fis);
//	  Sheet
		Sheet sheet = book.getSheet("Sheet2");
//	  Row
		Row row = sheet.getRow(2);
		
		Cell cell=row.createCell(4);
		cell.setCellValue("Passed");
		
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\ExcelData\\TestData.xlsx");
		fos.flush();
		fis.close();
	}
}
