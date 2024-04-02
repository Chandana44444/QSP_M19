package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsSelected {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);

		if (driver.findElement(By.id("RememberMe")).isSelected()) {
			System.out.println("selected already");
		} else {
			driver.findElement(By.id("RememberMe")).click();
		}

		Thread.sleep(4000);
		driver.quit();

	}
}
