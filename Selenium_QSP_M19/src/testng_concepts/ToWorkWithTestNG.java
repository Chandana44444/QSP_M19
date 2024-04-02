package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithTestNG { //testng class
@Test
public void m1() {//testng method/test case
	Reporter.log("hi testng!...");//not print on console
	Reporter.log("hi testng!...",true);//print on console
	Reporter.log("hi testng!...",false);//will not print on console
	//System.out.println("hi testng");//not good practice to follow
	
	//test steps
}
}
