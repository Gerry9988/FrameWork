package com.luma.pageTest;

import org.testng.annotations.Test;

import pageClasses.CustomerLoginPage;


public class CustomerLoginTest extends BaseTest {
	

	@Test
	public void cstmrLogin() {
		CustomerLoginPage clp = new CustomerLoginPage(driver);
		clp.signInHeaderLink();
		clp.enterEmailOnSignInPage(); // enter email in sign in page
		clp.enterPasswordOnSignInPage(); // enter password in sign in page
		clp.clickSignInButtonOnSignInPage(); // click on signIn button on sign in page

	}
}
