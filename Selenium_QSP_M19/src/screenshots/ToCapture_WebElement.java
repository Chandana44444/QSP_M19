package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCapture_WebElement {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println(driver.getScreenshotAs(OutputType.FILE));
	
	WebElement ele_01 = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
	
	File source = ele_01.getScreenshotAs(OutputType.FILE);
	File destiny=new File("./screenshots/webelement.png");
	
	FileHandler.copy(source, destiny);
	
	Thread.sleep(3000);
	driver.quit();
}
}
