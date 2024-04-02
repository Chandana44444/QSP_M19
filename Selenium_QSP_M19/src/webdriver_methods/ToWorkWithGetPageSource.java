package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //driver.get("htdemowebshop.tricentis");//invalid argument exception
       System.out.println("code:"+driver.getPageSource());
	}

}
