package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import maven.selenium.testng.CommonUtil;
import maven.selenium.testng.JavaScriptUtil;
import maven.selenium.testng.TestCore;
import pageObjects.GooglePageElements;
import pageObjects.YahooPageElements;
import testData.TestCase1Data;



public class TestCase_1 extends TestCore{

	CommonUtil common = new CommonUtil();
	GooglePageElements googleElements = PageFactory.initElements(driver, GooglePageElements.class);
	YahooPageElements yahooElements = PageFactory.initElements(driver, YahooPageElements.class);
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("<<<< TEST STARTED >>>>");
		common.invokeApplication();
	}

	@Test(dataProvider = "google", dataProviderClass = TestCase1Data.class)
	public void step1(String title) throws InterruptedException{
		String pageTitle = driver.getTitle();
		common.sleepFor(2);
		JavaScriptUtil.highlightElement(googleElements.GoogleLogo);
		Assert.assertEquals(pageTitle, title);
	}

	@Test(dataProvider = "yahoo", dataProviderClass = TestCase1Data.class)
	public void step2(String title) throws InterruptedException{
		common.navigateTo("https://www.yahoo.com");
		common.waitForPageToLoad();
		String pageTitle = driver.getTitle();
		JavaScriptUtil.highlightElement(yahooElements.YahooLogo);
		boolean isTitleExpected = pageTitle.contains(title); 
		Assert.assertTrue(isTitleExpected);
	}

	@AfterTest
	public void afterTest(){
		System.out.println("<<<< TEST COMPLETED >>>>");
	}

}
