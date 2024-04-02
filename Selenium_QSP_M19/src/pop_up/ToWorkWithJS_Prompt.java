package pop_up;

import java.io.Serial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithJS_Prompt {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
	driver.switchTo().frame("iframeResult");
	
	WebElement btn = driver.findElement(By.xpath("//button[text()='Try it']"));
	btn.click();
	
	Thread.sleep(1000);
	
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("Selenium");
	Thread.sleep(1000);
	a.accept();//perform a click action on ok button
	
	Thread.sleep(3000);
	//driver.quit();
}
}
