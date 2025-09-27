package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page_guest {
	
	public WebDriver driver;
	
	public home_page_guest(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	
    public String url = "https://www.amazon.in/";

	@FindBy(id = "nav-logo")
	public WebElement headerLogo;
	
	@FindBy(id = "glow-ingress-block")
	public WebElement deliveryAddress;
	
	@FindBy(id = "nav-search")
	public WebElement searchSection;
	
	@FindBy(id = "icp-nav-flyout")
	public WebElement languageDropdown;
	
	@FindBy(id = "nav-link-accountList")
	public WebElement signinLink;
	
	@FindBy(id = "nav-orders")
	public WebElement ordersLink;
	
	@FindBy(id = "nav-cart-count-container")
	public WebElement cartIcon;
	
	@FindBy(id = "nav-main")
	public WebElement headerMainNav;
	
	@FindBy(id = "desktop-banner")
	public WebElement bannerImageContainer;
	
	@FindBy(id = "desktop-grid-1-D1")
	public WebElement signInRecommendationGrid;
	
	@FindBy(id = "ad")
	public WebElement adProduct;
	
	@FindBy(id = "desktop-1")
	public WebElement exchangeDealCarrosel;
	
	@FindBy(id= "rhf-shoveler")
	public WebElement moreItemToConsiderSection;
	
	@FindBy(xpath= "//div[@class='rhf-sign-in-button']/span/span/a/span[.='Sign in']")
	public WebElement bottomSignInButton;
	
	@FindBy(className= "rhf-sign-in-tooltip-new-customer")
	public WebElement newCustomerLink;
	

}
