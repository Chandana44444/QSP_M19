package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDependantAndIndependantXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Blue and')]/../../..//input[@value='Add to cart']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
