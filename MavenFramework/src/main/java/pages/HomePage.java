package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utils.PropertyReader;

public class HomePage extends BasePage {
	
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	By a_TryCycleNow = By.xpath("//a[contains(text(),'Try CYCLE NOW')]");
	By input_Submit = By.xpath("//input[@value='Submit']");
	By input_FirstName = By.xpath("//input[@placeholder=\"First Name*\"]");
	
	//Page Action
	public void openApp() {
		goToUrl(PropertyReader.readItem("url"));
	}
	
	
	public void navigateToForm() {
		click(a_TryCycleNow);
	}
	
	
	

}
