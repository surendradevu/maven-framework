package base;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.qameta.allure.Allure;

import org.testng.annotations.*;

import utils.DriverManager;
import utils.Log;
import utils.PropertyReader;

public class TestBase extends DriverManager {
	
	
	//Setup and TearDown
	
	public WebDriver driver;
	PropertyReader pr=new PropertyReader();
	public TestBase() {
		this.driver=super.getDriver();
	}

	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		try {
			String bName=PropertyReader.readItem("browser");
			Log.info("BrowserName:------:"+bName);
			if(PropertyReader.readItem("browser").equalsIgnoreCase("chrome")) {
				//				System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selenium\\Project\\Drivers\\ChromeDriver\\chromedriver.exe");
				String chromeDriverPath= System.getProperty("user.dir")+"\\Drivers\\ChromeDriver\\chromedriver.exe";
				Log.info("Creating new Chrome Driver: Chrome Driver Path--->"+chromeDriverPath);
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				driver = new ChromeDriver();
				Log.info("Created new Chrome Driver: Chrome Driver Path--->"+chromeDriverPath);
				
				driver.manage().window().maximize();
			}
			
		}catch(Exception e) {
						try {
						throw new Exception("Chrome Browser Driver is not supported.["+e);
					}catch(Exception e1) {
						Log.error("No Chrome Browser Support:"+e1);
					}
				}
	
	
		}
	
	
	@AfterMethod(alwaysRun=false)
	public void tearDown() {
		
		driver.quit();
		
	}
	
	public void takeScrenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
	}
	
	
}

