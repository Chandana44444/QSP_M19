package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithPartialLinkText_03 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/user/youtube/videos");
		Thread.sleep(6000);
		
		driver.findElement(By.partialLinkText("@AlishaMarie talks Vlogmas")).click();//write the same as it appears on webpage
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@title=\"Play (k)\"]")).click();
		driver.quit();
	}

}
