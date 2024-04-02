package pop_up;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileDownloadPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.oracle.com/java/technologies/downloads/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[contains(text(),'https://download.oracle.com/java/21/')])[1]")).click();
	
	Thread.sleep(4000);
	//driver.quit();//close everything
	//driver.close();//close main window
	
}
}
