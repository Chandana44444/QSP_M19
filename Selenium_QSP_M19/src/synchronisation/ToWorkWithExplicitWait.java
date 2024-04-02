package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWorkWithExplicitWait {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(2));
	
	driver.get("https://www.shoppersstack.com/products_page/5");
	explicitwait.until(ExpectedConditions.urlToBe("https://www.shoppersstack.com/products_page/5"));
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	WebElement check_btn = driver.findElement(By.id("Check"));
	explicitwait.until(ExpectedConditions.elementToBeClickable(check_btn));
	check_btn.click();
	
	Thread.sleep(2000);
	//driver.quit();
	
}
}
