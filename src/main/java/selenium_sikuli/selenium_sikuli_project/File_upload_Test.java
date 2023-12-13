package selenium_sikuli.selenium_sikuli_project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class File_upload_Test {

		public static void main(String[] args) throws InterruptedException, FindFailed {
			

			// step1: formulate a test domain url & driver path
			String siteUrl = "file:///C:/eclipse%20workspace/eclipse_Workspace_1/selenium_sikuli_project/static/upload-file.html";
			String driverPath = "drivers/windows/chromedriver.exe";

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.chrome.driver", driverPath);

			// step3: instantiate selenium webdriver
			String inputFlePath="C:\\eclipse workspace\\eclipse_Workspace_1\\selenium_sikuli_project\\sikuli-inputs\\upload-file.png";
			WebDriver driver = new ChromeDriver();
			Screen screen = new Screen();
			
			Pattern pattern = new Pattern(inputFlePath+ "choose-file.png");
			Pattern fileInput = new Pattern(inputFlePath+ "file-text-box.png");
			Pattern openButton = new Pattern(inputFlePath+ "open-button.png");
			
			// make browser window full screen
			driver.manage().window().maximize();
			// step4: launch browser
			driver.get(siteUrl);
			
			Thread.sleep(2000);
			
			screen.click(pattern);
			
			Thread.sleep(2000);
			
			screen.click(fileInput);
			
			screen.type(fileInput, (inputFlePath + "amazon-tv.png") );
			
			Thread.sleep(2000);
			
			screen.click(openButton);
			
			
			
			// step6: close driver
			// driver.close();
		}
	}