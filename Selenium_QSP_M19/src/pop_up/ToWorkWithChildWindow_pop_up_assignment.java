package pop_up;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithChildWindow_pop_up_assignment {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/User/Desktop/Selenium/MultipleWindows/MultipleWindow.html");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[value=\"Open Food Sites\"]")).click();
	Thread.sleep(5000);
	
	Set<String> all_windows_id = driver.getWindowHandles();
	System.out.println(all_windows_id);
	
	for(String id:all_windows_id) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Cadbury Chocolate")) {
			driver.close();
		}	
	}
	
	Thread.sleep(4000);
	//driver.quit();//close everything
	//driver.close();//close main window
	
}
}
