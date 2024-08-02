package com.sadakar.pageobjects;

import org.openqa.selenium.By;

public class HRMLoginPOM {

	// Locators for username, password, loginButton
	public By userNameLocator = By.name("username");
	public By passwordLocator = By.name("password");
	//public By loginButtonLocator = By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button");
	public By loginButtonLocator = By.xpath("//button[@type=\'submit\']");
}
