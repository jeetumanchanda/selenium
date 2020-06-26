package testData;

import org.testng.annotations.DataProvider;

public class TestCase1Data {
	
	@DataProvider(name = "google")
	public Object[][] getGoogleData(){
		return new Object[][]
				{
			{"Google"}
				};
		
	}
	
	@DataProvider(name = "yahoo")
	public Object[][] getYahooData(){
		return new Object[][]
				{
			{"Yahoo"}
				};
		
	}

}
