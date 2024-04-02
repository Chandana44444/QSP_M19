package pop_up;

import java.io.Serial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithJS_Alert {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement search_btn = driver.findElement(By.xpath("//input[@value='Search']"));
	search_btn.click();
	
	Thread.sleep(3000);
	
	Alert a=driver.switchTo().alert();
	a.accept();//perform a click action on ok button
	
	Thread.sleep(3000);
	driver.quit();
}
}
