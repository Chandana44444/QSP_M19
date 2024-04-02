package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchMi {
@Test
public void launchMi() throws InterruptedException {
	//int a=10/0;
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mi.com/in/");
	Thread.sleep(1000);
	driver.quit();
}
}
