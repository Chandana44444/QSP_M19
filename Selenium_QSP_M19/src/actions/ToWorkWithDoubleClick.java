package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement add = driver.findElement(By.id("add"));
		WebElement minus = driver.findElement(By.id("minus"));

		Actions a = new Actions(driver);
		a.doubleClick(add).perform();//2
		Thread.sleep(2000);
		a.doubleClick(add).perform();//3
		Thread.sleep(2000);
		a.doubleClick(minus).perform();//2

		Thread.sleep(3000);
	    driver.quit();
	}
}
