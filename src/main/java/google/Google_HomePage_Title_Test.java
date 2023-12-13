package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_HomePage_Title_Test {

	public static void main(String[] args) {
		//step 1: formulate a test domain url and driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";
				
		//step 2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
				
		//step 3: Instantiate selenium webdriver
		WebDriver driver = new FirefoxDriver();
			
		//step 4: launch browser
		driver.get(siteUrl);
				
		//step 5: Evaluate the test
		String title = "Google";
		if(title.equals(driver.getTitle())) {
			System.out.println("Test is Passed");
		}
		else { 
			System.out.println("Test is failed");
		}
				
		System.out.println("Expected title :: "+title);
		System.out.println("Actual title :: "+driver.getTitle());
				
		//step 6: close browser
	    driver.close();
	}
}