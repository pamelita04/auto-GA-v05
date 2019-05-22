package org.umssdiplo.automationv01.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.umssdiplo.automationv01.spring.CucumberContext;
import org.umssdiplo.automationv01.spring.PropertiesContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes={CucumberContext.class, PropertiesContext.class})
public class ParentSteps {

	@Autowired
	protected WebDriver webdriver;
	
	@Autowired
	protected WebDriverWait wait;
	
	@Autowired
	protected boolean screenshotOnFailure;
	
	@Autowired
	protected String screenshotDestinationFolder;
	
}
