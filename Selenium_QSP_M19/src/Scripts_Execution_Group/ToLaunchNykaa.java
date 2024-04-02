package Scripts_Execution_Group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchNykaa {
@Test(groups = "shopping")
public void launchNykaa() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaafashion.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
