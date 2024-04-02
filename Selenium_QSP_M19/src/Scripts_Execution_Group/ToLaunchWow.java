package Scripts_Execution_Group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchWow {
@Test(groups = "beauty")
public void launchWow() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.buywow.in/");
	Thread.sleep(1000);
	driver.quit();
}
}
