package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToWorkWith_DWS_Login {
@Test
public void login() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	if(driver.getTitle().equals("Demo Web Shop")) {
		System.out.println("you are in home page,cant perform the action");
	}
	else if(driver.getTitle().equals("Demo Web Shop.Login")) {
		System.out.println("you are in login page,can perform the action");
	}
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
}
}
