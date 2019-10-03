package tests;
import environment.EnvironmentManager;
import environment.RunEnvironment;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.PageMethod;



public class DemoTest {
	
	public String baseUrl = "http://automationpractice.com";
	public String LinkedText = "MY ACCOUNT";

	@Before
	public void startBrowser(){
		EnvironmentManager.initWebDriver();
	}
	
	@Test
    public void demo() {
		// Testing the Login Function 
		WebDriver driver = RunEnvironment.getWebDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        PageMethod _homePage = new PageMethod(driver);
        _homePage.ClickLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assertEquals( _homePage.SignedIn(), LinkedText );
       
        
    }
		
	
    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
	

}
;