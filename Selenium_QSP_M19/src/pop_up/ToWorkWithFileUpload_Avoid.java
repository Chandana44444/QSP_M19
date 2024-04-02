package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload_Avoid {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//avoid
	driver.get("https://resume.naukri.com/cv-submission");
	Thread.sleep(3000);
	
	driver.findElement(By.id("infile")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\selenium notes online.pdf");
	Thread.sleep(1000);
	
	Thread.sleep(4000);
	driver.quit();
}
}
