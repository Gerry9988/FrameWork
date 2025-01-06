package com.luma.pageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justTest {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://magento.softwaretestingboard.com");
		
		driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]/following-sibling::li/a")).click();
	}

}
