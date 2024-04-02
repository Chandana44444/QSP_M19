package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.name("Email")).sendKeys("chandana@gmail.com");
		
		Thread.sleep(4000);
		driver.quit();
	}

}
