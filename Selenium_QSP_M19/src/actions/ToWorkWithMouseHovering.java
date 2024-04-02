package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithMouseHovering {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));

		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();

		Thread.sleep(5000);
	    driver.quit();
	}
}
