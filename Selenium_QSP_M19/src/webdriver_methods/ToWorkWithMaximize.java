package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithMaximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(3000);
		driver.quit();
	}

}
