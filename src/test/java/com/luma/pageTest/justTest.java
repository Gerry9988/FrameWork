package com.luma.pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://magento.softwaretestingboard.com");
		
		driver.findElement(By.xpath("//header[@class='page-header']//li[@class='authorization-link']/a")).click();
		

	}

}
