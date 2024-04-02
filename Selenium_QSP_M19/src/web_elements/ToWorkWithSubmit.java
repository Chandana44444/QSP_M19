package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSubmit {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).submit();

	Thread.sleep(3000);
	driver.quit();
	
}
}
