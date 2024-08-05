package com.anhtester.projects.website.HealthcareMulti.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class ContactUsPage {
	private By contact=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[6]");
	public void clickcontact() {
		WebUI.clickElement(contact);
	}
	public void verifyContactUsPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Contact - American Health Care Academy");
	}

}
