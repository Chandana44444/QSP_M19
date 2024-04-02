package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisabledElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss3_enabled_disabled");
	Thread.sleep(1000);
	
	driver.switchTo().frame("iframeResult_0");
	Thread.sleep(1000);
	
	WebElement disabled_ele = driver.findElement(By.cssSelector("input[value=\"Disneyland\"]"));
	//disabled_ele.sendKeys("fyguj");//exception:element not interactable
	
	driver.executeScript("arguments[0].value='selenium';", disabled_ele);
	
	Thread.sleep(1000);
	//driver.quit();
	
}
}
