package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.linkText("Log in"));

		Actions a = new Actions(driver);
		a.click(ele).perform();

		Thread.sleep(5000);
	    driver.quit();
	}
}
