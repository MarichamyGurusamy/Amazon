package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import keywords.common;
import pages.guest_user;
import pages.home_page_guest;

public class guest_user_flow extends baseTest {
	
	@Test(priority = 1)
	public void home_page_guest() {
		
		guest_user guest_user = new guest_user(driver);
		
		home_page_guest home =  new home_page_guest(driver);
		
		common  keyword = new common(driver);
		
		Assert.assertTrue(keyword.pageShouldContainElement(home.headerLogo),"Logo not displaying");
		
		Assert.assertTrue(keyword.urlShoulbe(home.url),"Url mis matched");
		
		Assert.assertTrue(home.bannerImageContainer.isDisplayed());
		
		Assert.assertTrue(home.headerMainNav.isDisplayed());
		
		Assert.assertTrue(home.deliveryAddress.isDisplayed());
		
		Assert.assertTrue(home.languageDropdown.isDisplayed());
		
		Assert.assertTrue(home.ordersLink.isDisplayed());
		
		Assert.assertTrue(home.cartIcon.isDisplayed());
		
		Assert.assertTrue(home.signinLink.isDisplayed());
		
		Assert.assertTrue(home.exchangeDealCarrosel.isDisplayed());
		
		Assert.assertTrue(home.searchSection.isDisplayed());
		
		Assert.assertTrue(home.adProduct.isDisplayed());
		
		Assert.assertTrue(home.moreItemToConsiderSection.isDisplayed());
		
		Assert.assertTrue(home.bottomSignInButton.isDisplayed());
		
		Assert.assertTrue(home.signInRecommendationGrid.isDisplayed());
		
		Assert.assertTrue(home.newCustomerLink.isDisplayed());
		
		
		
			
			
	}

}
