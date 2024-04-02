package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //driver.get("htdemowebshop.tricentis");//invalid argument exception
	}

}
