package com.sadakar.common;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

	@Before //Cucumber Before Hook
	public static void setupDriver() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Projects\\CMA\\projects\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@After // Cucumber After hook
	public static void quitDriver() throws Exception {
		driver.quit();
	}

}
