package maven.selenium.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	/**
	 * Load property files
	 */
	public void loadProperties(){
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			String applicationUrl = prop.getProperty("applicationURL");
			System.setProperty("applicationURL", applicationUrl);
			String executionEnvironment = prop.getProperty("executionEnvironment");
			System.setProperty("executionEnvironment", executionEnvironment);
			String standardTimeout = prop.getProperty("standardTimeout");
			System.setProperty("standardTimeout", standardTimeout);

		} catch (IOException ex) {
			ex.printStackTrace();

		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Get Application URL from Property File
	 * @return
	 */
	public String getApplicationURL(){
		String applicationURL = System.getProperty("applicationURL");
		return applicationURL;
	}

	/**
	 * Get Execution Environment details from Property File
	 * @return
	 */
	public String getExecutionEnvironment(){
		String executionEnvironment = System.getProperty("executionEnvironment");
		return executionEnvironment;
	}
	
	/**
	 * Get Standard Timeout from Property File
	 * @return
	 */
	public int getStandardTimeout(){
		int standardTimeout = Integer.parseInt(System.getProperty("standardTimeout"));
		return standardTimeout;
	}
}
