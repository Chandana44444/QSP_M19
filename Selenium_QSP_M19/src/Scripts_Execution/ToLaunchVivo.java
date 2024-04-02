package Scripts_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchVivo {
@Test
public void launchVivo() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vivo.com/in");
	Thread.sleep(1000);
	driver.quit();
}
}
