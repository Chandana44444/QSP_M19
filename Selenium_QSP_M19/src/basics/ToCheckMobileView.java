package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckMobileView {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Twitter")).click();//by default will be treated as desktop view
	
	Thread.sleep(4000);
	driver.quit();
}
}
