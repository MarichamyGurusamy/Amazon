package Tests;

import org.testng.annotations.Test;

import pages.guest_user;

public class guest_user_flow extends baseTest {
	@Test(invocationCount = 15)
	public void verifyElementsForguestUser() {
		
		guest_user user = new guest_user(driver);
		
		System.out.println("Test");
		
		
	}

}
