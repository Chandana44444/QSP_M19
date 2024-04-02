package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIDLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		//driver.get("https://www.amazon.in/ap/signin");
		Thread.sleep(5000);
		
		driver.findElement(By.id("FirstName")).sendKeys("chandana");
		//driver.findElement(By.id("ap_email")).sendKeys("abcde");
		
		Thread.sleep(4000);
		driver.quit();
	}

}
