package Scripts_Execution_Group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchOppo {
@Test(groups = "mobile")
public void launchOppo() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oppo.com/in/");
	Thread.sleep(1000);
	driver.quit();
}
}
