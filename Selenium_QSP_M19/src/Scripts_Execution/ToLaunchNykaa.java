package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchNykaa {
@Test
public void launchNykaa() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaafashion.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
