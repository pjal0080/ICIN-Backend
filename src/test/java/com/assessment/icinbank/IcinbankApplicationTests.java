package com.assessment.icinbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

class IcinbankApplicationTests {

	@Test
	public void loginTest(){
		System.out.println("Login test started");

		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();



	}

}
