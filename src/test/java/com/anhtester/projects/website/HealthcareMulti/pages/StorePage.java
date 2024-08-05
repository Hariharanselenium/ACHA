package com.anhtester.projects.website.HealthcareMulti.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class StorePage {
	private By Store=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[2]");
	public void clickstore() {
		WebUI.clickElement(Store);
	}

	public void verifyStorePageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Addons | Shop - American Health Care Academy");
	}

}
