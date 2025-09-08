package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.WebDriverManager;

public class baseTest extends WebDriverManager {
	
	WebDriver driver;
	
	

	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser","url"})
	public void openBrowser(String browser, String url) {
		
		System.out.println(browser);
		System.out.println(url);
		
		driver = launchbrowser(browser, url);
		
	}
	
	
	
	@AfterMethod(alwaysRun = true)
	public void closebrowser() {
		
		driver.quit();
		
	}
	
}
