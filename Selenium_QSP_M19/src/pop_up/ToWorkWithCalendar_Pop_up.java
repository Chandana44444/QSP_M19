package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithCalendar_Pop_up {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://in.via.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.id("wzrk-cancel")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//div[@class=\"calendar-icon\"])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[text()='20'])[1]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class=\"element return-element\"]")).click();
	
	Thread.sleep(3000);
	driver.quit();
}
}
