package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNavigate {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        System.out.println("title after navigation:"+driver.getTitle());
        driver.findElement(By.linkText("Register")).click();
        System.out.println("title after clicking on register link:"+driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
       System.out.println("title after back method:"+driver.getTitle());
       driver.navigate().forward();
       System.out.println("title after forward method:"+driver.getTitle());
       driver.navigate().refresh();
       System.out.println("title after refresh method:"+driver.getTitle());
       driver.navigate().to("https://www.selenium.dev/downloads/");
       System.out.println("title after To method:"+driver.getTitle());
       Thread.sleep(4000);
       driver.quit();

	}

}
