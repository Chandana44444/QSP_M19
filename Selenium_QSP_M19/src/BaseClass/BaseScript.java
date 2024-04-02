package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseScript {
	ChromeDriver driver;
@BeforeSuite
public void beforesuite() {
	Reporter.log("connection of application to server of DB",true);
}
@BeforeTest
public void beforetest() {
	Reporter.log("connection of application to DB",true);
}
@BeforeClass
public void beforeclass() {
	Reporter.log("opening of browser and enter the url",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
}
@BeforeMethod
public void beforemethod() {
	Reporter.log("login to application",true);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzabc");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();	
}
@AfterSuite
public void aftersuite() {
	Reporter.log("dis-connection of application to server of DB",true);
}
@AfterTest
public void aftertest() {
	Reporter.log("dis-connection of application to DB",true);
}
@AfterClass
public void afterclass() {
	Reporter.log("closing of browser",true);
    driver.quit();
}
@AfterMethod
public void aftermethod() {
	Reporter.log("logout to application",true);
	driver.findElement(By.linkText("Log out")).click();
}
}
