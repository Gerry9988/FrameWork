package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	// create new account link
	private By createAccountLink = By.xpath("(//li[@class='authorization-link'])[1]/following-sibling::li/a");
	// firstName
	private By firstName = By.xpath("//input[@name='firstname']");
	// lastName
	private By lastNmae = By.xpath("//input[@name='lastname']");
	// email
	private By email = By.xpath("//input[@id='email_address']");
	// password
	private By pswd = By.xpath("//input[@id='password']");
	// re-enter password
	private By cnfrmPswa = By.xpath("//input[@id='password-confirmation']");
	// submit button
	private By sbmt = By.cssSelector("button.action.submit.primary");
	// Sign In link
	private By sgnInLink = By.xpath("//header[@class='page-header']//li[@class='authorization-link']/a");
	// email text field on signIn page
	private By sgnInEmail = By.xpath("//input[@id='email']");
	// password text field on signIn page
	private By sgnInPswd = By.xpath("//input[@name='login[password]']");
	// signIn button
	private By sgnBtn = By.xpath("(//div[@class='primary'])[1]/button");

	public void createAccountClick() {
		driver.findElement(createAccountLink).click();
	}

	// enter first name on create account page
	public void enterfirstName() {
		WebElement fstName = driver.findElement(firstName);
		fstName.sendKeys("John");
	}

	// enter last name on create account page
	public void enterLastName() {
		WebElement lstName = driver.findElement(lastNmae);
		lstName.sendKeys("Cena");
	}

	// enter email on create account page
	public void enterEmail() {
		WebElement mail = driver.findElement(email);
		mail.sendKeys("JohnCena@gmail.com");
	}

	// enter password on create account page
	public void enterPassword() {
		WebElement passwd = driver.findElement(pswd);
		passwd.sendKeys("Cena1234");
	}

	// re-enter the password
	public void reEnterPassword() {
		WebElement reEnter = driver.findElement(cnfrmPswa);
		reEnter.sendKeys("Cena1234");
	}

	// click on submit
	public void submitForm() {
		driver.findElement(sbmt).click();
	}

	// click on SignInLink
	public void signInHeaderLink() {
		driver.findElement(sgnInLink).click();
	}

	// enter email on signIn text field
	public void enterEmailOnSignInPage() {
		driver.findElement(sgnInEmail).sendKeys("JohnCena@gmail.com");
	}

	// enter password on signIn test field
	public void enterPasswordOnSignInPage() {
		driver.findElement(sgnInPswd).sendKeys("Cena1234");;
	}

	// click on signIn button on signIn page
	public void clickSignInButtonOnSignInPage() {
		driver.findElement(sgnBtn).click();
	}

}
