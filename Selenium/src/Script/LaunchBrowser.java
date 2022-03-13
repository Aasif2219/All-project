package Script;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
		
	    ChromeOptions options = new ChromeOptions();
	    
	       options.setExperimentalOption("useAutomationExtension",false);
	       options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.Google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Selenium\\ScreenShots\\SC1.png"));

	}

}
