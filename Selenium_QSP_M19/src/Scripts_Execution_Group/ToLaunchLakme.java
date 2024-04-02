package Scripts_Execution_Group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchLakme {
@Test(groups = "beauty")
public void launchLakme() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lakmeindia.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
