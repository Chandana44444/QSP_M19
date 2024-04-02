package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetRect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	
	WebElement fname = driver.findElement(By.id("FirstName"));
	WebElement lname = driver.findElement(By.id("LastName"));
    WebElement email = driver.findElement(By.id("Email"));
    
   System.out.println( fname.getRect().getPoint());
  System.out.println("x value of fname is:"+fname.getRect().getPoint().getX());
  System.out.println("y value of fname is:"+fname.getRect().getPoint().getY());
  
  System.out.println( lname.getRect().getPoint());
  System.out.println("x value of lname is:"+lname.getRect().getPoint().getX());
  System.out.println("y value of lname is:"+lname.getRect().getPoint().getY());
  
  if(fname.getRect().getPoint().getX()==lname.getRect().getPoint().getX()) {
	  System.out.println("Alligned correctly");
  }
  else
	  System.out.println("not alligned correctly");
  
  System.out.println("******************************************");
  
  System.out.println("Dimension of fname web element:"+fname.getRect().getDimension());
  System.out.println("height of fname:"+fname.getRect().getDimension().getHeight());
  System.out.println("width of fname:"+fname.getRect().getWidth());
 
   Thread.sleep(3000);
   driver.quit();
	
}
}
