package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWithNotificationPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
//	ChromeOptions settings=new ChromeOptions();
//	settings.addArguments("--disable-notifications");
//	ChromeDriver driver=new ChromeDriver(settings);

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/");
		Thread.sleep(6000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);// close,allow,block
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);// click on close
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		driver.quit();

	}
}
