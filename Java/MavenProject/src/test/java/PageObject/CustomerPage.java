package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import environment.RunEnvironment;

public class CustomerPage {
	WebDriver driver = RunEnvironment.getWebDriver();
	
	
	public CustomerPage(WebDriver driver){
		this.driver = driver;
	}
	
	//Click the home button 
	public void ClickHomeButton(){
		driver.findElement(By.linkText("Home")).click();
		System.out.println("This is the first printing");

		
		try{
			//Hover
			WebElement women = driver.findElement(By.cssSelector("ul>li:nth-child(1)>a[title='Women']"));
			Actions builder = new Actions(driver);  
			builder.moveToElement(women).perform();//this will hover to women
			
			
		}
		
		catch(StaleElementReferenceException e){
			System.out.println("Something went wrong");
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//Click the T-shirt option
	public void ClickOption(){
		driver.findElement(By.cssSelector("ul>li:nth-child(1)>a[title='T-shirts']")).click();
	}

}
