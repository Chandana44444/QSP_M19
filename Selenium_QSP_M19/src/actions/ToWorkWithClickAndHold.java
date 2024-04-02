package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClickAndHold {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//li[text()='C']"));
	
	Actions act=new Actions(driver);
	act.clickAndHold(ele).perform();
	
	Thread.sleep(3000);
	//driver.quit();
}
}
