package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchLakme {
@Test
public void launchLakme() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lakmeindia.com/");
	Thread.sleep(1000);
	driver.quit();
}
}
