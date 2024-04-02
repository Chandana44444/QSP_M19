package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithEnabled { //testng class
@Test(enabled = true)
public void m1() {//testng method/test case
	Reporter.log("from m1",true);//print on console
	Reporter.log("from testng DWS",true);//print on console
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.quit();
}
}
//not execute
