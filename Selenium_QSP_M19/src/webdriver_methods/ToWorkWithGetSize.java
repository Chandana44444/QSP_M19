package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(8000);
		
		System.out.println("Dimension:"+driver.manage().window().getSize());//Dimension
		System.out.println("height:"+driver.manage().window().getSize().getHeight());//int
		System.out.println("width:"+driver.manage().window().getSize().getWidth());
		driver.quit();
	}

}
