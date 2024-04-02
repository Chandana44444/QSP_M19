package testng_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithTimeOut { //testng class
@Test(timeOut = 8000)
public void m1() {//testng method/test case
	Reporter.log("from m1",true);//print on console
	Reporter.log("from testng DWS",true);//print on console
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzabc");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	driver.quit();
}
}
//not execute
