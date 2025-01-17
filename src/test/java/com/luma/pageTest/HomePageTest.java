package com.luma.pageTest;

import org.testng.annotations.Test;

import pageClasses.HomePage;

public class HomePageTest extends BaseTest {
	
	//CustomerLoginTest clt = new CustomerLoginTest();
	@Test
	public void verifyCreateAccountLinkOnHomePage() {
		HomePage hp = new HomePage(driver);
		hp.createAccountClick(); // click on create account link
		hp.enterfirstName(); // enter firstName in form
		hp.enterLastName(); // enter lastName in form
		hp.enterEmail(); // enter email
		hp.enterPassword(); // enter password
		hp.reEnterPassword(); // confirm password
		hp.submitForm(); // click on submit button
		//hp.signInHeaderLink(); // click on signIn link
		//clt.cstmrLogin();

		

	}
}
