package pop_up;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithChildWindow_pop_up {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/5");
	Thread.sleep(12000);
	
	driver.findElement(By.id("compare")).click();
	Thread.sleep(6000);
	
	Set<String> all_windows_id = driver.getWindowHandles();
	System.out.println(all_windows_id);
	
	for(String id:all_windows_id) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("ShoppersStack | Product Description")) {
			driver.close();
		}	
	}
	
	Thread.sleep(4000);
	//driver.quit();//close everything
	//driver.close();//close main window
	
}
}
