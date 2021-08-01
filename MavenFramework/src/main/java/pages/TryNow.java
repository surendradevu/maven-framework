package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utils.PropertyReader;

public class TryNow extends BasePage {
	
	WebDriver driver;
	public TryNow(WebDriver driver) {
		super(driver);
		this.driver=driver;
		By a_TryCycleNow1 = By.xpath("//a[contains(text(),'Try CYCLE NOW1')]");
		goToUrl(PropertyReader.readItem("url"));
	}
	
	
	
	

}
