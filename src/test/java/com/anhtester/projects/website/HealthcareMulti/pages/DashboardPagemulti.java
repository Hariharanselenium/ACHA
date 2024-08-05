package com.anhtester.projects.website.HealthcareMulti.pages;

import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class DashboardPagemulti {

	
	public void verifyDashboardPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Dashboard | Groupadmin - American Health Care Academy");
	}


}
