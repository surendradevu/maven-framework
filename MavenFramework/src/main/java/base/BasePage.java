package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.WaitForHelper;

public class BasePage {
	
	
	
	//Navigate
	//Wait for Element
	//click etc
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//Naviagte
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public void waitForElementToApppear(By elementLocation) {
		
		new WaitForHelper(driver).presenceOfElement(elementLocation);
		
	}
	
	public void waitForLoading() {
		new WaitForHelper(driver).implicitWait();
	}

	
	public void click(By elementLocation) {driver.findElement(elementLocation).click();}
	
	public void writeText(By elementLocation,String text) {
		driver.findElement(elementLocation).clear();
		driver.findElement(elementLocation).sendKeys(text);
	}
	
	
	public String readText(By elementLocation) {return driver.findElement(elementLocation).getText();	}
	
	public void moveElement(By elementLocation) {
		new Actions(driver).moveToElement(driver.findElement(elementLocation)).build().perform();
	}
	
	
}
