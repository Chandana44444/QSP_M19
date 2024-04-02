package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCapture_EntireScreen {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println(driver.getScreenshotAs(OutputType.FILE));
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destiny=new File("./screenshots/entirepage.png");
	
	FileHandler.copy(source, destiny);
	
	Thread.sleep(3000);
	driver.quit();
}
}
