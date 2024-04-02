package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToWorkWith_DWS_Login_HardAssert {
@Test
public void login() {
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://demowebshop.tricentis.com/login");
//	Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "you are not in expected web page and can't proceed with the task");//stop execution
//	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "you are not in expected web page and can't proceed with the task");//will not stop execution
//	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Assert.assertNotEquals(driver.getTitle(), "Demo Web Shop", "you are not in expected web page and can't proceed with the task");//will stop execution
	//Assert.assertNotEquals(driver.getTitle(), "Demo Web Shop. Login", "you are not in expected web page and can't proceed with the task");//will stop execution
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	WebElement remember_check_box = driver.findElement(By.id("RememberMe"));
	Assert.assertTrue(remember_check_box.isSelected(), "not selected");//error
	//Assert.assertFalse(remember_check_box.isSelected(), "is selected");
	remember_check_box.click();

}
}
