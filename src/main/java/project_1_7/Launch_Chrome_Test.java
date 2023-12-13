package project_1_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Test {

	public static void main(String[] args) {
		//step 1: formulate a test domain url and driver path
				String siteUrl = "https://www.google.com";
				String driverPath = "drivers/windows/chromedriver.exe";
		//step 2: set system properties for selenium driver
				System.setProperty("webdriver.chrome.driver", driverPath);
		//step 3: Instantiate selenium webdriver
				WebDriver driver = new ChromeDriver();
		//step 4: launch browser
				driver.get(siteUrl);				
	}

}
