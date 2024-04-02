package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.CDATASection;

public class ToWorkWith_ScrollIntoView {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(1000);
	
	WebElement ele_01 = driver.findElement(By.id("register-button"));
	
	driver.executeScript("arguments[0].scrollIntoView(true);",ele_01);//top of the page 
	Thread.sleep(4000);
	driver.executeScript("arguments[0].scrollIntoView(false);",ele_01);//bottom of the page 
	Thread.sleep(4000);
	
	Thread.sleep(2000);
	driver.quit();
}
}

//sync
//asynch=>multiple task
//arr
//String arr1={"avc","hh","jhkij"}
//arr1[0]
//WebElement arguments={ele_01,ele_02};
//arguments[0]
