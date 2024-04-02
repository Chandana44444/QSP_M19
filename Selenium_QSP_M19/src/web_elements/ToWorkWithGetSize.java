package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetSize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	
	WebElement fname = driver.findElement(By.id("FirstName"));
	WebElement lname = driver.findElement(By.id("LastName"));
	
	System.out.println("Dimension of fname:"+fname.getSize());
	System.out.println("Height of fname:"+fname.getSize().getHeight());
	System.out.println("Width of fname:"+fname.getSize().getWidth());
	
    Thread.sleep(1000);
   driver.quit();
	
}
}
