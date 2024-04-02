package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFrames {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.dream11.com/");
	Thread.sleep(3000);
	
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("send-sms-iframe");
	
	WebElement frame_01 = driver.findElement(By.cssSelector("iframe[id=\"send-sms-iframe\"]"));
	driver.switchTo().frame(frame_01);
	
	WebElement mobile_no_text_field = driver.findElement(By.id("regEmail"));
	mobile_no_text_field.sendKeys("654675787");
	
	driver.switchTo().parentFrame();//will switch to its immediate parent
	//driver.switchTo().defaultContent();//will switch to main frame
	
	driver.findElement(By.id("menu_parent")).click();
	
	Thread.sleep(6000);
	driver.quit();
}
}

//frame-01(main frame)
//frame-02   frame-2.01
