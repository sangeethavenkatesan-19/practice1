package make_my_trip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class will demonstrate the web locators using relative xpath
 * 
 * @author Sangeetha V         
 *
 */
public class google_web_locators {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		setUp();
		searchLinkTest();
		
	}
	public static void setUp() {

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.makemytrip.com/";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: add implicit wait (Unconditional Delay)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// step5: launch browser
		driver.get(siteUrl);
	}
	// Relative Xpath
		public static void searchLinkTest() {

			WebElement searchLink = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));

			System.out.println("Is link loaded :: " + searchLink.isDisplayed());
			System.out.println("Is link is enabled :: " + searchLink.isEnabled());

			searchLink.click();

			String expectedTitle = "Challenge Validation";
			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Test is Passed !");
			} else {
				System.out.println("Test is Failed !");
			}

			System.out.println("Expected Title : " + expectedTitle);
			System.out.println("Actual Title : " + actualTitle);
		}
}
