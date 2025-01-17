package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage {

	WebDriver driver;

	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
		//super();
	}

	// locators
	// Sign In link
	private By sgnInLink = By.xpath("//header[@class='page-header']//li[@class='authorization-link']/a");
	// email text field on signIn page
	private By sgnInEmail = By.xpath("//input[@id='email']");
	// password text field on signIn page
	private By sgnInPswd = By.xpath("//input[@name='login[password]']");
	// signIn button
	private By sgnBtn = By.xpath("(//div[@class='primary'])[1]/button");

	// enter email on signIn text field
	public void enterEmailOnSignInPage() {
		driver.findElement(sgnInEmail).sendKeys("JohnCena@gmail.com");
	}

	// enter password on signIn test field
	public void enterPasswordOnSignInPage() {
		driver.findElement(sgnInPswd).sendKeys("Cena1234");
	}

	// click on signIn button on signIn page
	public void clickSignInButtonOnSignInPage() {
		driver.findElement(sgnBtn).click();
	}

	// click on SignInLink
	public void signInHeaderLink() {
		driver.findElement(sgnInLink).click();

	}
}
