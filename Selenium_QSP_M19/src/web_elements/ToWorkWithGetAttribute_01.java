package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetAttribute_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	
	WebElement first_name_text_field = driver.findElement(By.id("FirstName"));
	
	System.out.println("before entering data:The first name entered is:"+first_name_text_field.getAttribute("val"));

	first_name_text_field.sendKeys("chandana");
	
	System.out.println("after entering data:The first name entered is:"+first_name_text_field.getAttribute("value"));
	
	Thread.sleep(3000);
	driver.quit();
}
}
