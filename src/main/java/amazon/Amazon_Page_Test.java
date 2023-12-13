package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Page_Test {

	public static void main(String[] args) {
		//step 1: formulate a test domain url and driver path
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/windows/chromedriver.exe";
				
		//step 2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
	
		//step 3: Instantiate selenium web driver
		WebDriver driver = new ChromeDriver();
				
		//step 4: launch browser
		driver.get(siteUrl);
			
		//step 5: Evaluate the test
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
				
		if(expectedTitle.equals(actualTitle)) {
				System.out.println("Test is Passed");
		}
		else { 
					System.out.println("Test is failed");
		}
		
		System.out.println("The actual url :: "+actualTitle);
		System.out.println("The expected URl :: "+expectedTitle); 
		
		//step 6: close browser
		driver.close();
	}
}
