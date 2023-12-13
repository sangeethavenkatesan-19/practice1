package selenium_sikuli.selenium_sikuli_project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Amazon_sikuli_Test {

		public static void main(String[] args) throws FindFailed, InterruptedException {

			// step1: formulate a test domain url & driver path
			String siteUrl = "https://www.amazon.in";
			String driverPath = "drivers/windows/geckodriver.exe";

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.geckodriver.driver", driverPath);

			// step3: instantiate selenium webdriver
			WebDriver driver = new FirefoxDriver();
			Screen screen = new Screen();
			
			// make browser window full screen
			driver.manage().window().maximize();
			// step4: launch browser
			driver.get(siteUrl);
			
			Thread.sleep(3000);
			
			Pattern pattern = new Pattern("C:\\eclipse workspace\\eclipse_Workspace_1\\selenium_sikuli_project\\sikuli-inputs\\amazon-minitv.png");
			
			Thread.sleep(3000);
			
			screen.click(pattern);
			
			
			
			// step6: close driver
			// driver.close();
		}
	}