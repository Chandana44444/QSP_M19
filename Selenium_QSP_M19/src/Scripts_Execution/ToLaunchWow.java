package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchWow {
@Test
public void launchWow() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.buywow.in/");
	Thread.sleep(1000);
	driver.quit();
}
}
