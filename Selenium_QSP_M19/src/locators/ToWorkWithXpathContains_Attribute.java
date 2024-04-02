package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithXpathContains_Attribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaafashion.com/");
		
//		driver.findElement(By.id("wzrk-cancel")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("kids");
		
		Thread.sleep(6000);
		driver.quit();
	}

}
