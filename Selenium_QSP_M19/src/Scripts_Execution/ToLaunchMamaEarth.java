package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchMamaEarth {
@Test
public void launchMamaEarth() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mamaearth.in/");
	Thread.sleep(1000);
	driver.quit();
}
}
