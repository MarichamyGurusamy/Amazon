package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import keywords.common;
import pages.guest_user;
import pages.home_page_guest;

public class guest_user_flow extends baseTest {
	
	@Test
	public void home_page_guest() {
		
		guest_user guest_user = new guest_user(driver);
		
		home_page_guest home =  new home_page_guest(driver);
		
		common  keyword = new common(driver);
		
		Assert.assertTrue(keyword.pageShouldContainElement(home.headerLogo),"Logo not displaying");
		
		Assert.assertTrue(keyword.urlShoulbe(home.url),"Url mis matched");
		
			
			
	}

}
