package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetTagname {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("FirstName"));
		WebElement lname = driver.findElement(By.id("LastName"));

		System.out.println("Tag used for developing fname is:" + fname.getTagName());

		Thread.sleep(1000);
		driver.quit();

	}
}
