package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("Computers")).click();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
