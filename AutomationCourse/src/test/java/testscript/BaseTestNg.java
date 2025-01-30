package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNg {
	public static WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser()
	{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage();
	driver.manage().window().maximize();

	}
	@AfterMethod

		public void browserQuit()
		{
			driver.close();
		}

}
