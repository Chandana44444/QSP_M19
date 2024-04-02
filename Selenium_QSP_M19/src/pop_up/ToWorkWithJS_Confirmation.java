package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithJS_Confirmation {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://licindia.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class=\"linkTxt\"])[3]")).click();
	
	Thread.sleep(2000);

	Alert a=driver.switchTo().alert();
	//a.dismiss();//perform a click action on cancel button
	a.accept();//perform a click action on ok button
	
	Thread.sleep(2000);
	driver.quit();
}
}
