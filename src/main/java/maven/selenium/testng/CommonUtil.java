package maven.selenium.testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil extends TestCore {

	/**
	 * Method to Invoke Application
	 */
	public void invokeApplication(){
		String URL = property.getApplicationURL();
		String environment = property.getExecutionEnvironment();
		System.out.println("Invoking application under "+environment+" environment. URL: "+URL);
		driver.get(URL);
		driver.manage().window().maximize();
		waitForPageToLoad();
	}
	
	/**
	 * Method to navigate to a URL
	 */
	public void navigateTo(String url){
		System.out.println("Navigating to URL: "+url);
		driver.get(url);
		waitForPageToLoad();
	}

	/**
	 * Method to Close the Application Window
	 */
	public void closeApplication(){
		driver.close();
	}
	
	/**
	 * Method to wait Implicitly
	 * @param Timeout
	 */
	public void implicitWait(int Timeout){
		driver.manage().timeouts().implicitlyWait(Timeout, TimeUnit.SECONDS);
	}
	
	/**
	 * method to wait for page to load
	 */
	public void waitForPageToLoad(){
		WebDriverWait wait = new WebDriverWait(driver, property.getStandardTimeout());
		System.out.println("Waiting for page to load.");
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		System.out.println("Page loaded.");
	}
	
	public void sleepFor(int seconds) throws InterruptedException{
		Thread.sleep(seconds * 1000);
	}
}