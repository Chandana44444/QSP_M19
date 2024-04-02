package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToWorkWithWindowDiffBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriver driver1=new FirefoxDriver();
       
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);//same browser different tab
        driver.get("https://www.skillrary.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);//diff browser
        driver.get("https://www.kalkifashion.com/");
        
        Thread.sleep(6000);
        driver.quit();
        
	}

}
