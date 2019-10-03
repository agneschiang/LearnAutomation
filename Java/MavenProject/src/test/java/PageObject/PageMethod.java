package PageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import environment.RunEnvironment;

public class PageMethod {
	
	WebDriver driver = RunEnvironment.getWebDriver();
	public String loginEmail = "seleniumtraining@gmail.com";
	public String password = "planit123";
	public String text = "page-heading";
	
	
	public PageMethod(WebDriver driver){
		this.driver = driver;		
	}
			
	
	public void ClickLogin(){
		driver.findElement((By.className("login"))).click();
		//Login with email
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(loginEmail);
		//Login with user name
		driver.findElement(By.id("passwd")).clear();
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	

	public String SignedIn() {
		
		String value =  driver.findElement(By.className(text)).getText().toString();
		return value;
	}

}
