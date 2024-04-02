package Scripts_Execution_Group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchPurplee {
@Test(groups = "shopping")
public void launchPurplee() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.purplle.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
