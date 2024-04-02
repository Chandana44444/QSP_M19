package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFullScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		driver.manage().window().fullscreen();

		Thread.sleep(3000);
		//driver.quit();
	}

}
