package pspTech.karigor.testCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pspTech.karigor.baseClass.BaseClass;
import pspTech.karigor.browserFactory.BrowserFactory;
import pspTech.karigor.pages.Home;
import pspTech.karigor.utilities.CommonMethods;

public class HomePage extends BaseClass {
	
	public HomePage() {
		super(driver);
	}
	
	Home home;
	@BeforeTest
	public void setUp() {
		driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		home = PageFactory.initElements(driver, Home.class);
		CommonMethods.maximizeBrowser();
		CommonMethods.getTitle(driver, "Karigor Production and Cultural Society");
		
	}
	@Test
	public void TC_001_HomepageHomebutton_clicked() {
		logger.info("Test Case TC_001 Clicking Home Button has started");
		CommonMethods.getTitle(driver, "Karigor Production and Cultural Society");
		CommonMethods.click(home.clickExploreKarigor, driver);
	
	}
	
	}

