package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUpload_Handle {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//handle
	driver.get("https://www.totaljobs.com/Account/Register");
	Thread.sleep(2000);
	
	driver.findElement(By.id("ccmgt_explicit_accept")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='pull-left']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("cvUploadOptions")).click();
	
	Runtime.getRuntime().exec("./AutoitScripts/FileUpload.exe");
	
	Thread.sleep(4000);
	driver.quit();
}
}
