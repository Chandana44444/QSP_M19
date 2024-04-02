package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFromPropertiesFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("./resources/properties_file.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.getProperty("url"));
		String url = prop.getProperty("url");

		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://demowebshop.tricentis.com/");
		// driver.get(prop.getProperty("url"));
		driver.get(url);

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);

		Thread.sleep(3000);
		driver.quit();
	}
}
