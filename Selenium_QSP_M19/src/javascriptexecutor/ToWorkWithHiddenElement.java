package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithHiddenElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	
//	driver.findElement(By.xpath("//label[text()='Custom']")).click();
//	WebElement ele = driver.findElement(By.name("custom_gender"));
//	ele.sendKeys("qsp");
	
	WebElement hidden_ele = driver.findElement(By.name("custom_gender"));	
	driver.executeScript("arguments[0].value='Qspiders';", hidden_ele);
	
	Thread.sleep(1000);
	//driver.quit();
}
}
