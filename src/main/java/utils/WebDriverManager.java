package utils;

import javax.management.ConstructorParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	
	WebDriver driver;
	
	
	
	public WebDriver launchbrowser(String browser,String url) {
		
	if(browser.equalsIgnoreCase("chrome")) {
		
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}else if(browser.equalsIgnoreCase("edge")) {
		
		driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff")) {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	return driver;
		
	}

}
