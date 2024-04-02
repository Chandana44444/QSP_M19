package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithThreadPoolSize { //testng class
@Test(invocationCount = 0,threadPoolSize = 2)
public void m2() throws InterruptedException {//testng method/test case
	Reporter.log("from DWS",true);//print on console
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.quit();
}
}
