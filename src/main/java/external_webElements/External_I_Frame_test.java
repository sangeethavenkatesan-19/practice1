package external_webElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class External_I_Frame_test {
	static WebDriver driver;
	public static void main(String[] args) {
		setUp();

	}
	public static void setUp() {

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/windows/geckodriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new FirefoxDriver();

		// step4: add implicit wait (Unconditional Delay)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// step5: launch browser
		driver.get(siteUrl);
	}
	public static void testCustomPopup() throws InterruptedException {
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

        // Print the number of iframes found
        System.out.println("Total number of iframes: " + iframes.size());

        // Print attributes of each iframe
		for (WebElement iframe : iframes) {
				System.out.println("Frame attributes: " + iframe.getAttribute("id") + " | " + iframe.getAttribute("name"));
		}
		// Example: Switch to a specific iframe by index
		if (iframes.size() > 0) {
			driver.switchTo().frame(0); // Switch to the first iframe (index 0)
        // Perform actions inside the iframe if needed
        // driver.findElement(By.id("element_inside_iframe")).click();
					driver.switchTo().defaultContent(); // Switch back to the main content
				}

				// Close the browser
				driver.quit();
	}
}