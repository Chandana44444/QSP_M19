package Scripts_Execution_Cross_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToLaunchPurplee {
	WebDriver driver;
	@Parameters("browsername")
@Test
public void launchPurplee(String browsername) throws InterruptedException {
	if(browsername.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("invalid browser name");
	}	driver.manage().window().maximize();
	driver.get("https://www.purplle.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
