package drop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandlesingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement single_select_list = driver.findElement(By.id("drop1"));
		
		Select s=new Select(single_select_list);
		//s.selectByIndex(1);
		//s.selectByValue("def");
		s.selectByVisibleText("doc 4");
		
		System.out.println("is the dropdown multi select:?"+s.isMultiple());//false

	}

}
