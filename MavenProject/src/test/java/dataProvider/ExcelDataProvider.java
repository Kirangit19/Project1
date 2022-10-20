package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider (parallel=true)
	public Object ExcelData() throws Exception {
		File src=new File(".\\src\\test\\resources\\ExcelData\\TestData1.xlsx");
		FileInputStream fis=new FileInputStream(src);
//		FileInputStream fis=new FileInputStream("./MavenProject/src/test/resources/ExcelData/TestData1.xlsx");
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row =sheet.getRow(0);
		int noRow=sheet.getLastRowNum();
		
		Cell cell=row.getCell(0);
		int noCol=row.getLastCellNum();
		
		String[][]data=new String [noRow-1][noCol];
		
		for(int i=0;i<noRow-1;i++) {
			for(int j=0;j<noCol;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}		
		return data;
	}
}
