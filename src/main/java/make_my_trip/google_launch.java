package make_my_trip;
/**
 * This class will demonstrate browser profile of make my trip in chrome.
 * 
 * @author Sangeetha V
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_launch {
		public static void main(String[] args) {
			//step 1: formulate a test domain url and driver path
			String siteUrl = "https://www.makemytrip.com/";
			String driverPath = "drivers/windows/chromedriver.exe";
			
			//step 2: set system properties for selenium driver
			System.setProperty("webdriver.chrome.driver", driverPath);
			
			//step 3: Instantiate selenium web driver
			WebDriver driver = new ChromeDriver();
			
			//step 4: launch browser
			driver.get(siteUrl);
			
			String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
			String actualTitle = driver.getTitle();
			
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("Loaing make my trip page in Chrome browser : Test is Passed");
			}
			else { 
				System.out.println("Test is failed");
		    }
			
			System.out.println("The actual title :: "+actualTitle);
			System.out.println("The expected Title :: "+expectedTitle);
	
	}
}