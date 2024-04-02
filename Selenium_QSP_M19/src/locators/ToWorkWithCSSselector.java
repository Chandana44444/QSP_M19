package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithCSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("Chandana");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
