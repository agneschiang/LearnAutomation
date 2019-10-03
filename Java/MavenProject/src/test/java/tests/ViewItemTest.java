package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObject.CustomerPage;
import PageObject.PageMethod;
import environment.EnvironmentManager;
import environment.RunEnvironment;

public class ViewItemTest {
	public String baseUrl = "http://automationpractice.com";
	public String LinkedText = "Home";
	
	
	@Before 
	public void startBrowser(){
		EnvironmentManager.initWebDriver();
	}
	
	@Test
	public void ViewItem(){
		//Create web driver object
		WebDriver driver = RunEnvironment.getWebDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Create home page object
		PageMethod _homePage = new PageMethod(driver);
		_homePage.ClickLogin();
		
		//Create a customer page object
		CustomerPage _customerPage = new CustomerPage(driver);
		_customerPage.ClickHomeButton();
		_customerPage.ClickOption();
		
	}
	
	@After
	public void tearDown(){
		EnvironmentManager.shutDownDriver();
	}

}
