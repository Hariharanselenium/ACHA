package com.anhtester.projects.website.Healthcare.pages;

import org.openqa.selenium.By;

import com.anhtester.keywords.WebUI;

public class LoginPage {
	 private By inputEmail = By.xpath("//input[@id='username']");
	    private By inputPassword = By.xpath("//input[@id='password']");
	    private By buttonLogin = By.xpath("//input[@value='Login']");
	
public DashboardPage loginsingle(String email,String password) {
	WebUI.setText(inputEmail, email);
    WebUI.setText(inputPassword, password);
    WebUI.clickElement(buttonLogin);
    return new DashboardPage();
}
}
