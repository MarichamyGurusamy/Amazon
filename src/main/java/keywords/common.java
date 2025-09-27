package keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class common {

	WebDriver driver;

	public common(WebDriver driver) {

		this.driver=driver;
	}

	public boolean pageShouldContainElement(WebElement element) {

		boolean result = element.isDisplayed();

		return result;

	}
	
	public boolean urlShoulbe(String url) {
		
		String currentUrl = driver.getCurrentUrl();
		
		if(url.equals(currentUrl))
			return true;
		
		else
			return false;
		
	}

}
