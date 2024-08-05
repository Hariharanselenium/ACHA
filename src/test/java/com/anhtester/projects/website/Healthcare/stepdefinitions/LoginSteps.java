package com.anhtester.projects.website.Healthcare.stepdefinitions;

import com.anhtester.hooks.TestContext;
import com.anhtester.keywords.WebUI;
import com.anhtester.projects.website.Healthcare.pages.BillingPage;
import com.anhtester.projects.website.Healthcare.pages.ContactUsPage;
import com.anhtester.projects.website.Healthcare.pages.DashboardPage;
import com.anhtester.projects.website.Healthcare.pages.HandsonkitPage;
import com.anhtester.projects.website.Healthcare.pages.HomePage;
import com.anhtester.projects.website.Healthcare.pages.LoginPage;
import com.anhtester.projects.website.Healthcare.pages.StorePage;
import com.anhtester.projects.website.Healthcare.pages.StudentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashboard;
	BillingPage billingPage;
	ContactUsPage contactUsPage;
	HandsonkitPage handsonkitPage;
	StorePage storePage;
	StudentPage studentPage;

	public LoginSteps(TestContext testContext) {

		loginPage = testContext.getLoginPage();
		homePage = testContext.getHomePage();
		dashboard = testContext.getDashboardPage();
		storePage = testContext.getStorePage();
		handsonkitPage = testContext.getHandsonkitPage();
		studentPage = testContext.getStudentPage();
		billingPage = testContext.getBillingPagePage();
		contactUsPage = testContext.getContactUsPage();

	}

	@Given("User navigate to Login Page for Admin {string}")
	public void Geturl(String url) {
		WebUI.getURL(url);
	}

//@When("click customer login")
//public void selectcustomerlogin() {
//	loginPage =homePage.clickcustomerLogin();
//	
//}
	@When("user enter Username {string} password {string}")
	public void userEnterUsernamePasswordAndClickLoginButton(String Username, String password) {
		dashboard = loginPage.loginsingle(Username, password);
	}

//    @And("click Login button")
//    public void clickLoginButton() {
//    }

	@Then("user is redirected to the Dashboard page")
	public void userIsRedirectedToTheDashboardPage() {
		dashboard.verifyDashboardPageDisplays();
	}

	@Then("user is redirected to the store page")
	public void userIsRedirectedToThestorePage() {
		storePage.clickstore();
		storePage.verifyStorePageDisplays();
	}

	@Then("user is redirected to the Hands-on Kit page")
	public void userIsRedirectedToThehandPage() {
		handsonkitPage.clickhandson();
		handsonkitPage.verifyHandsonkitPageDisplays();
	}

	@Then("user is redirected to the Student Profile page")
	public void userIsRedirectedToThestudentPage() {
		studentPage.clickstudent();
		studentPage.verifyStudentPageDisplays();
	}

	@Then("user is redirected to the Billing page")
	public void userIsRedirectedToTheBillingPage() {
		billingPage.clickbilling();
		billingPage.verifyBillingPageDisplays();
	}

	@Then("user is redirected to the Contact Us page")
	public void userIsRedirectedToTheContactUsPage() {
		contactUsPage.clickcontact();
		contactUsPage.verifyContactUsPageDisplays();
	}
}
