package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToWorkWith_DWS_Login_SoftAssert {
	@Test
	public void login() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		SoftAssert sa = new SoftAssert();
		sa.assertNotEquals(driver.getTitle(), "Demo Web Shop",
				"you are not in expected web page and can't proceed with the task");// will stop execution
		// sa.assertNotEquals(driver.getTitle(), "Demo Web Shop. Login", "you are not in
		// expected web page and can't proceed with the task");//will stop execution
		driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
		WebElement remember_check_box = driver.findElement(By.id("RememberMe"));
		//sa.assertTrue(remember_check_box.isSelected(), "not selected");// error
		sa.assertFalse(remember_check_box.isSelected(), "is selected");//will execute
		remember_check_box.click();
		sa.assertAll();//will print error 
		//sa.assertAll();//if not used will not get to know any error 
		driver.quit();
	

	}
}
