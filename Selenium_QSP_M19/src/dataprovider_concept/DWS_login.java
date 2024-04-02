package dataprovider_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS_login {
@DataProvider(parallel = true)
public String[][] data_fetching_from_Excel() throws EncryptedDocumentException, IOException {
	File file=new File("./resources/Excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	int row_count = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
	System.out.println(row_count);
	int column_count = wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
	System.out.println(column_count);
	
	String[][] arr=new String[row_count][column_count];
//	arr[0][0]="gikhuiu";
//	
//	System.out.println(arr);
//	System.out.println(arr[0][0]);//null
	
	for(int row=0;row<row_count;row++) {
		for(int col=0;col<column_count;col++) {
			arr[row][col]=wb.getSheet("Sheet2").getRow(row).getCell(col).toString();
		    System.out.println(arr[row][col]);			
		}
	}
	return arr;
}
	
@Test(dataProvider = "data_fetching_from_Excel")
public void DWS_login(String[] arr) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(arr[0]);
	driver.findElement(By.id("Password")).sendKeys(arr[1]);
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	Thread.sleep(2000);
	driver.quit();
}
	
}

