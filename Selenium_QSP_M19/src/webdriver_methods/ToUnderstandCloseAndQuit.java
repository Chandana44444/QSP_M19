package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstack.com/products_page/6");
        Thread.sleep(5000);
        driver.findElement(By.id("compare")).click();
        Thread.sleep(2000);
       System.out.println("ID:"+driver.getWindowHandles());
       //driver.close();//main window
       driver.quit();//all window
	}

}
