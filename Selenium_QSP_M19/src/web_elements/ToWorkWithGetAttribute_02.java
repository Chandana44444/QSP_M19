
package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetAttribute_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodenstreet.com/");
	Thread.sleep(2000);
	
	WebElement img_not_loaded = driver.findElement(By.xpath("//img[@alt='buy wooden furniture in India']"));
	System.out.println("the image titles is:"+img_not_loaded.getAttribute("alt"));
	
	Thread.sleep(3000);
	driver.quit();
}
}
