package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import pageObjectData.GooglePageData;


public class GooglePageElements extends GooglePageData {
	
	final WebDriver driver;
	
	public GooglePageElements(WebDriver driver)
	 
	 {
	 this.driver = driver;
	 }	
	
	//Page Objects
	
	@FindBy(xpath = GoogleLogoXpath)
	public WebElement GoogleLogo;
	
		
}
