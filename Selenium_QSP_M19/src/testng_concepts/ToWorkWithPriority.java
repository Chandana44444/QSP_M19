package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithPriority { //testng class
@Test(priority = -1)
public void m2() {//testng method/test case
	Reporter.log("from m2",true);//print on console
}
@Test(priority = -1)
public void m1() {//testng method/test case
	Reporter.log("from m1",true);//print on console
}
@Test(priority = -2)
public void m0() {//testng method/test case
	Reporter.log("from m0",true);//print on console
}
}

//m1:109+49=158
//m2:109+50=159
//ascii values

//try executing from lowest - hightest value
