package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	WebDriver driver;
	
	public WebDriver initializeBrowser()
	{
		String browserName = System.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user-pc\\Desktop\\eclipse\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user-pc\\Desktop\\eclipse\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
