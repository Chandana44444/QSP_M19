package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
	    List<WebElement> all_element = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(all_element);//address
		
		for(int i=0;i<all_element.size();i++) {
			all_element.get(i).sendKeys("abcd");
		}
		
		Thread.sleep(5000);
		//driver.quit();

	}

}
