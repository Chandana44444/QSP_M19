package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("1234");
		//driver.findElement(By.xpath("//span[text()='Grocery']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
