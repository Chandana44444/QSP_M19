package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithMinimize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(3000);
		//driver.quit();
	}

}
