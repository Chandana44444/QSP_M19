package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetCssValue {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement error_msg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
	
	System.out.println("The color of error message is:"+error_msg.getCssValue("color"));
	System.out.println("The font style of error message is:"+error_msg.getCssValue("font-family"));
	System.out.println("The property that does not exist for error message is:"+error_msg.getCssValue("ffamily"));//blank

	
	Thread.sleep(3000);
	driver.quit();
}
}
