package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TestsClass {

	WebDriver driver;
	
	@Test
	public void startExecution()
	{
		Base b = new Base();
		driver = b.initializeBrowser();
		driver.get("https://www.google.com");
	}
}
