package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAuthenticationPopUp {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Avoid
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//username:password
	
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	Thread.sleep(2000);
	
	//handle
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);//username
	
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);//password
	
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);//sign in button
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);//click on sign-in
	
	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_D);
	r.keyRelease(KeyEvent.VK_M);
	r.keyRelease(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	driver.quit();
}
}
