package com.anhtester.projects.website.HealthcareMulti.pages;

import org.openqa.selenium.By;

import com.anhtester.keywords.WebUI;

public class LoginPageMulti {
	 private By inputEmail = By.xpath("//input[@id='email']");
	    private By inputPassword = By.xpath("//input[@id='password']");
	    private By buttonLogin = By.xpath("//input[@value='Login']");
	
public DashboardPagemulti loginMulti(String email,String password) {
	WebUI.setText(inputEmail, email);
    WebUI.setText(inputPassword, password);
    WebUI.clickElement(buttonLogin);
    return new DashboardPagemulti();
}
}
