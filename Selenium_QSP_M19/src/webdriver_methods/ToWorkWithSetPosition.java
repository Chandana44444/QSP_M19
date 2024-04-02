package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		System.out.println("Co-ordinate values:"+driver.manage().window().getPosition());//Point
		System.out.println("X:"+driver.manage().window().getPosition().getX());//int
		System.out.println("Y:"+driver.manage().window().getPosition().getY());//int
		
		Point p=new Point(56, 66);
		driver.manage().window().setPosition(p);
		
		System.out.println("Co-ordinate values:"+driver.manage().window().getPosition());//Point
		System.out.println("X:"+driver.manage().window().getPosition().getX());//int
		System.out.println("Y:"+driver.manage().window().getPosition().getY());//int
		
		//driver.quit();
	}

}
