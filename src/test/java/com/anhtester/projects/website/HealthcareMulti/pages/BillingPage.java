package com.anhtester.projects.website.HealthcareMulti.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class BillingPage {
	private By billing=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[5]");
	public void clickbilling() {
		WebUI.clickElement(billing);
	}

	public void verifyBillingPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Billing | User - American Health Care Academy");
	}

}
