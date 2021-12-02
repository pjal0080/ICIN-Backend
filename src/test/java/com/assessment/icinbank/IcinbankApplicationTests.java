package com.assessment.icinbank;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class IcinbankApplicationTests {

	@Test
	public void loginTest(){
		System.out.println("Login test started");

		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "http://localhost:4200/login";
		driver.get(url);
		System.out.println("Page is opened");
		sleep(2000);


		WebElement username = driver.findElement(By.xpath("//app-root/app-login//form//input[@type='text']"));
		username.sendKeys("piyushpranjal27@gmail.com");
		sleep(2000);

		WebElement password = driver.findElement(By.xpath("//app-root/app-login//form//input[@type='password']"));
		password.sendKeys("admin");
		sleep(2000);

		WebElement loginButton = driver.findElement(By.xpath("//app-root/app-login//form//button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		System.out.println("Login successfull");

		sleep(3000);
		WebElement logoutButton = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/button[@type='submit']"));
		logoutButton.click();
		sleep(2000);
		System.out.println("Logout successfull");

		driver.quit();
	}

	public void sleep(long m) {

		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
