package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithPartialLinkText_02 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(6000);
		
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("SAREE")).click();//write the same as it appears on webpage
		
		Thread.sleep(4000);
		driver.quit();
	}

}
