package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithImplicitWait {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//exception
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement hidden_ele = driver.findElement(By.name("custom_gender"));	
	driver.executeScript("arguments[0].value='Qspiders';", hidden_ele);
	
	Thread.sleep(1000);
	driver.quit();
}
}
