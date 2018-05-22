package demogit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gitsample1 {
	@Test
	public void Openapp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\lakshme\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	}
}
