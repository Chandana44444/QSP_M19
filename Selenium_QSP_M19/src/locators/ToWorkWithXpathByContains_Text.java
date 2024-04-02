package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithXpathByContains_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		
		driver.findElement(By.xpath("//a[contains(text(),'Polka Dot Top')]")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
