package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsEnabled {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(6000);
	
	WebElement ele = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//	ele.click();
	boolean result = ele.isEnabled();
	
	System.out.println("is the web element enabled?"+result);
	
	Thread.sleep(4000);
	driver.quit();
	
}
}
