package javascriptexecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.CDATASection;

public class ToWorkWith_ScrollBy {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	driver.executeScript("window.scrollBy(0,600);");//scroll down
	Thread.sleep(2000);
	driver.executeScript("window.scrollBy(0,600);");//scroll down
	Thread.sleep(2000);
	driver.executeScript("window.scrollBy(0,-600);");//scroll up

	Thread.sleep(2000);
	driver.quit();
}
}
