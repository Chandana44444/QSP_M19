package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSwitchToWindow {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstack.com/products_page/6");
        Thread.sleep(9000);
        driver.findElement(By.id("compare")).click();
        Thread.sleep(2000);
       System.out.println("ID:"+driver.getWindowHandles());
       
       Set<String> all_windows_id = driver.getWindowHandles();
       
       for(String id:all_windows_id) {
    	   driver.switchTo().window(id);
    	  System.out.println(driver.getTitle());
       }
       
       //driver.close();//main window
       driver.quit();//all window
	}

}

//set<String>
//arr=["nasdkln","nhlk","bhk"];

