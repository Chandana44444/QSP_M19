package testng_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithDependsOnMethods { 
@Test(dependsOnMethods = "registration",alwaysRun = true)//nonexistent method
public void login() {//skipped
	int a=10/0;
	Reporter.log("from DWS Login",true);//print on console
}
@Test
public void registration() {//failure
	int a=10/0;//exception
	Reporter.log("from DWS Register",true);//print on console
}
}
//2 script,1 pass,1 fail