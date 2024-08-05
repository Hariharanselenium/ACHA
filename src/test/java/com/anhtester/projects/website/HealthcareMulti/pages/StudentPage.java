package com.anhtester.projects.website.HealthcareMulti.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class StudentPage {
	private By studentprofile=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[4]");
	public void clickstudent() {
		WebUI.clickElement(studentprofile);
	}

	public void verifyStudentPageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Dashboard | User - American Health Care Academy");
	}

}
