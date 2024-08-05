package com.anhtester.projects.website.Healthcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.anhtester.keywords.WebUI;

public class StorePage {
	private By Store=By.xpath("(//div[@id='mainmenu_container']/descendant::li)[2]");
	private By  boxproduct=By.xpath("//div[@class='box-product']");
	public void clickstore() {
		WebUI.clickElement(Store);
	}

	public void verifyStorePageDisplays() {
		Assert.assertEquals(WebUI.getPageTitle(),"Addons | Shop - American Health Care Academy");
	}
public void selecttheproduct(String product) {
	List<WebElement> products=WebUI.getWebElements(boxproduct);
	
}
}
