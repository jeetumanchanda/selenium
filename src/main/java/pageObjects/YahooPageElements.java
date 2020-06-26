package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjectData.YahooPageData;

public class YahooPageElements extends YahooPageData{
	
	final WebDriver driver;

	public YahooPageElements(WebDriver driver)
	 
	 {
	 this.driver = driver;
	 }
	
	//Page Objects
	
	@FindBy(xpath = YahooLogoXpath)
	public WebElement YahooLogo;
	
	
}
