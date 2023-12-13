package google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google_Search_Test {
	public static void main(String[] args) {
		//step 1: formulate a test domain url and driver path
		String siteUrl = "https://www.google.com";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		//step 2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//step 3: Instantiate selenium web driver
		WebDriver driver = new ChromeDriver();
		
		//step 4: launch browser
		driver.get(siteUrl);
		
		//step 5: Evaluate the test
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium document");
		searchBox.submit();
		
		String expectedTitle = "selenium document - Google Search";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed");
		}
		else { 
			System.out.println("Test is failed");
	    }
		
		//step 6: close browser
		//driver.close();
	}
}
