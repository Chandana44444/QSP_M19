package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCapture_WebElement_Assignment {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	Thread.sleep(1000);
	WebElement error_msg = driver.findElement(By.cssSelector("div[class=\"validation-summary-errors\"]"));
	
	System.out.println(error_msg.getScreenshotAs(OutputType.FILE));
	
	File source = error_msg.getScreenshotAs(OutputType.FILE);
	File destiny=new File("./screenshots/webelement_assignment.png");
	
	FileHandler.copy(source, destiny);
	
	Thread.sleep(3000);
	driver.quit();
}
}
