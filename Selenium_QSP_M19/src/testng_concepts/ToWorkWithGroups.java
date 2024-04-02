package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithGroups {
@Test(groups = "Functional")
public void TestScript_01() {
	//int a=10/0;
	Reporter.log("Functional script-01",true);
}
@Test(groups = "Functional")
public void TestScript_04() {
	Reporter.log("Functional script-02",true);
}

@Test(groups = "Integration",dependsOnGroups ="Function" )//non existent group
public void TestScript_02() {
	Reporter.log("Integration script",true);
}
@Test(groups = "System",dependsOnGroups ="Functional")
public void TestScript_03() {
	Reporter.log("System script",true);
}

}
