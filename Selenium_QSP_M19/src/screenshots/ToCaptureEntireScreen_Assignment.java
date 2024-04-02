package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireScreen_Assignment {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("register-button")).click();
	
	LocalDateTime date = LocalDateTime.now();//try to fetch date along with time(seconds)
	String Date_Time = date.toString().replaceAll(":", "-");
	System.out.println(Date_Time);
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File destiny=new File("./screenshots/"+Date_Time+"_Assignment_01.png");
	
	FileHandler.copy(src, destiny);
	
	Thread.sleep(1000);
	driver.quit();
	
}
}
