package com.anhtester.projects.website.Healthcare.pages;

import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class DashboardPage {

	
	public void verifyDashboardPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Dashboard - American Health Care Academy");
	}


}
