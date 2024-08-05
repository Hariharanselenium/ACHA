package com.anhtester.projects.website.Healthcare.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class HandsonkitPage {
	private By handson=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[3]");
	public void clickhandson() {
		WebUI.clickElement(handson);
	}
	public void verifyHandsonkitPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Champ | Shop - American Health Care Academy");
	}

}
