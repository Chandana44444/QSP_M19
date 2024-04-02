package drop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		
		Select s=new Select(multiselect);
		s.selectByIndex(0);
		s.selectByValue("Hyundaix");
		s.selectByVisibleText("Audi");
		
		System.out.println(s.getOptions().size());//count total no of choices
		s.selectByIndex(s.getOptions().size()-1);//last option from list
		
		System.out.println("Choices:"+multiselect.getText());
		
		System.out.println("no of choices selected is:"+s.getAllSelectedOptions().size());//count
		
//		s.deselectByIndex(3);
//		s.deselectByValue("Hyundaix");
//		s.deselectByVisibleText("Volvo");
		s.deselectAll();
		
		System.out.println("no of choices selected is:"+s.getAllSelectedOptions().size());//count
		
		Thread.sleep(3000);
		//driver.quit();

	}

}
