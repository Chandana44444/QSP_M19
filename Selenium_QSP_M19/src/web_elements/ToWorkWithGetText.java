package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetText {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	
	WebElement error_msg = driver.findElement(By.cssSelector("div[class=\"validation-summary-errors\"]"));
	
	System.out.println("Error message without giving any credentials is:"+error_msg.getText());
	
	Thread.sleep(4000);
	driver.quit();
}
}
