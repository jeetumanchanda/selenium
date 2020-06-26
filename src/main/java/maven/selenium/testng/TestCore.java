package maven.selenium.testng;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCore {

	public PropertiesUtil property = new PropertiesUtil();
	public static WebDriver driver = setDriver();

	/**
	 * Method to load the property file
	 */
	@BeforeTest(alwaysRun = true)
	public void setProperties(){
		property.loadProperties();
		System.out.println("Before Test : Properties set");
	}

	/**
	 * Method to set the driver instance
	 * @return driver instance
	 */
	@BeforeGroups(alwaysRun = true)
	public static WebDriver setDriver(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Before Groups : Driver set");
		return driver;
	}
	
	/**
	 * Method to close the browser window
	 */
	@AfterClass(alwaysRun = true)
	public void closeBrowser(){
		driver.close();
	}
	
//	public static void takeScreenshot() throws Exception {
//		String timeStamp;
//		File screenShotName;
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//The below method will save the screen shot in d drive with name "screenshot.png"
//		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
//		screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
//		FileUtils.copyFile(scrFile, screenShotName);
//		 
//		String filePath = screenShotName.toString();
//		String path = "<img src="\"file://"" alt="\"\"/" />";
//		Reporter.log(path);
//		 
//		}
}