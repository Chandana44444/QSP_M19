package BaseClass;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_01 extends BaseScript{
@Test
public void FT_01() throws InterruptedException {
	Reporter.log("Script-01",true);
	driver.findElement(By.id("small-searchterms")).sendKeys("books");
	Thread.sleep(2000);
}
@Test
public void FT_02() throws InterruptedException {
	Reporter.log("Script-02",true);
	driver.findElement(By.id("newsletter-email")).sendKeys("books");
	Thread.sleep(2000);
}
}