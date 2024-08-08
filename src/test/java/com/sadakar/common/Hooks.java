package com.sadakar.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;  // Assurez-vous d'avoir cette dépendance dans votre projet
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    @Before // Cucumber Before Hook
    public static void setupDriver() throws InterruptedException {
      
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After // Cucumber After hook
    public static void quitDriver() throws Exception {
      
        if (driver != null) {
            driver.quit();
        }
    }
}


