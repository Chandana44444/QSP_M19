package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("email")).sendKeys("chandana@gmail.com");
		driver.findElement(By.className("button-1 login-button")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
