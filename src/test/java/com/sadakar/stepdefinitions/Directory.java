package com.sadakar.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.sadakar.common.BasePage;
import com.sadakar.pageobjects.DirectoryPOM;

import io.cucumber.java.en.Then; 
public class Directory extends BasePage{

	DirectoryPOM dir = new DirectoryPOM();
	
	@Then("User is on Directory page")
	public void directoryPage() {

		// Navigating to Directory Page/tab
		driver.findElement(dir.viewDirectoryLinkLocator).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Then("Is Search button displayed")
	public void isSearchButtonDisplayed() {
	
		// Verifying Search button is displayed or not
		WebElement searchButtonEle = driver.findElement(dir.searchButtonLocator);
		Assert.assertTrue(searchButtonEle.isDisplayed());
	}
}
