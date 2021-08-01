package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Log;

import base.TestBase;
import pages.HomePage;
import pages.TryNow;


public class LaunchApp2 extends TestBase {

	@Test
	public void submitForm() {
		//TestBase tb=new TestBase();
		Log.info("submitForm:------:submitForm");	
		TryNow tryNow=new TryNow(driver);

	}
	


}
