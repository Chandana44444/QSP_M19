package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithRightClick {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	
	Thread.sleep(3000);
	driver.quit();
}
}
