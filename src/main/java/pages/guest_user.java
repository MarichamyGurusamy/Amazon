package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class guest_user {
	
	WebDriver driver;
	
	
	
	public guest_user(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	String URL = "https://tst.lindelink.com/";
	
	
	@FindBy(id="warningBanner")
	public WebElement welcomBanner ;
	
	@FindBy(id="warningband-btn")
	public WebElement welcomBannerClose ;
	
	@FindBy(xpath="//span[@class='hidden-xs']")
	public WebElement loginLink ;
	
	
	

}
