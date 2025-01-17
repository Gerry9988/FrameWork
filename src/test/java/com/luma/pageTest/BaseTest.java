package com.luma.pageTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.BaseUtils;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void launchSite() throws IOException {
		//String browser = BaseUtils.getConfigValue("browser1");
		String browser ="chrome";
		switch (browser.toLowerCase()) {
		// launch Chrome browser
		case "chrome":
			driver = new ChromeDriver();
			break;
		// launch Firefox browser
		case "firefox":
			driver = new FirefoxDriver();
			break;
		// lauch microsoft edge browser
		case "edge":
			driver = new EdgeDriver();
			break;
		// launch Safari browser
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("No driver found");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("implicitWait"))));
		driver.navigate().to(BaseUtils.getConfigValue("url"));

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	}

}
