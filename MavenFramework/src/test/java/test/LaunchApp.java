package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Log;

import base.TestBase;
import pages.HomePage;


public class LaunchApp extends TestBase {

	@Test
	public void verifyForm() {
		//TestBase tb=new TestBase();
		Log.info("launchApp:------:launchApp");	
		HomePage homePage=new HomePage(driver);		
		homePage.openApp();
		takeScrenShot("HomePage");
		homePage.navigateToForm();
		takeScrenShot("Form");

	}
	


}
