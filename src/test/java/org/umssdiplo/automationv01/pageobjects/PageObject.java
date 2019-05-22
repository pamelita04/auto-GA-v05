package org.umssdiplo.automationv01.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	protected WebDriver webdriver;
	
	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.webdriver = driver;
	}
}
