package com.anhtester.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

import com.anhtester.driver.DriverManager;
import com.anhtester.driver.TargetFactory;
import com.anhtester.projects.website.Healthcare.pages.BillingPage;
import com.anhtester.projects.website.Healthcare.pages.ContactUsPage;
import com.anhtester.projects.website.Healthcare.pages.DashboardPage;
import com.anhtester.projects.website.Healthcare.pages.HandsonkitPage;
import com.anhtester.projects.website.Healthcare.pages.HomePage;
import com.anhtester.projects.website.Healthcare.pages.LoginPage;
import com.anhtester.projects.website.Healthcare.pages.StorePage;
import com.anhtester.projects.website.Healthcare.pages.StudentPage;
import com.anhtester.projects.website.HealthcareMulti.pages.DashboardPagemulti;
import com.anhtester.projects.website.HealthcareMulti.pages.LoginPageMulti;
import com.anhtester.utils.LogUtils;

public class TestContext {

	private WebDriver driver;

	public TestContext() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = ThreadGuard.protect(new TargetFactory().createInstance());
		driver.manage().window().maximize();
		DriverManager.setDriver(driver);
		LogUtils.info("Driver in TestContext: " + getDriver());
	}

	private LoginPageMulti loginPageMulti;
	private DashboardPagemulti dashboard2;
	private LoginPage loginPage;
	private HomePage homePage;
	private DashboardPage dashboard;
	private BillingPage billingPage;
	private ContactUsPage contactUsPage;
	private HandsonkitPage handsonkitPage;
	private StorePage storePage;
	private StudentPage studentPage;

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}

	public DashboardPage getDashboardPage() {
		if (dashboard == null) {
			dashboard = new DashboardPage();
		}
		return dashboard;
	}

	public BillingPage getBillingPagePage() {
		if (billingPage == null) {
			billingPage = new BillingPage();
		}
		return billingPage;
	}

	public ContactUsPage getContactUsPage() {
		if (contactUsPage == null) {
			contactUsPage = new ContactUsPage();
		}
		return contactUsPage;
	}

	public HandsonkitPage getHandsonkitPage() {
		if (handsonkitPage == null) {
			handsonkitPage = new HandsonkitPage();
		}
		return handsonkitPage;
	}

	public StorePage getStorePage() {
		if (storePage == null) {
			storePage = new StorePage();
		}
		return storePage;
	}

	public StudentPage getStudentPage() {
		if (studentPage == null) {
			studentPage = new StudentPage();
		}
		return studentPage;
	}

	public LoginPageMulti getLoginMultiPage() {
		if (loginPageMulti == null) {
			loginPageMulti = new LoginPageMulti();
		}
		return loginPageMulti;
	}

	public DashboardPagemulti getDashboardPageMulti() {
		if (dashboard2 == null) {
			dashboard2 = new DashboardPagemulti();
		}
		return dashboard2;
	}

	public WebDriver getDriver() {
		return DriverManager.getDriver();
	}

}
