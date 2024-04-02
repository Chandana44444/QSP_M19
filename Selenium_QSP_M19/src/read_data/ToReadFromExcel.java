package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFromExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("./resources/Excel.xlsx");
		FileInputStream fis = new FileInputStream(file);

//		Workbook wb = new XSSFWorkbook(fis);
		Workbook wb=WorkbookFactory.create(fis);//.xlsx,.xls
		//System.out.println("String value:" + wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());

		String url = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

//		System.out.println("boolean value:" + wb.getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue());
//		System.out.println("Numeric value:" + wb.getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue());
//		System.out.println("date in DATE:" + wb.getSheet("Sheet1").getRow(6).getCell(1).getDateCellValue());
//		System.out.println("date in LDT:" + wb.getSheet("Sheet1").getRow(6).getCell(1).getLocalDateTimeCellValue());

		System.out.println("String value:" + wb.getSheet("Sheet1").getRow(0).getCell(0).toString());
		System.out.println("boolean value:" + wb.getSheet("Sheet1").getRow(2).getCell(2).toString());
		System.out.println("Numeric value:" + wb.getSheet("Sheet1").getRow(4).getCell(0).toString());
		System.out.println("date in DATE:" + wb.getSheet("Sheet1").getRow(6).getCell(1).toString());
		System.out.println("date in LDT:" + wb.getSheet("Sheet1").getRow(6).getCell(1).toString());

//		ChromeDriver driver = new ChromeDriver();
//		driver.get(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
//		driver.get(url);
//
//		Thread.sleep(3000);
//		driver.quit();
	}
}
