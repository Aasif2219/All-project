package jsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		WebElement joinfree = driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
        
/*		//Flashing Element
		JavaScriptUtil.flash(joinfree, driver);
		
		//Drawing border around Element 
		JavaScriptUtil.drawBorder(joinfree, driver);
		
		Thread.sleep(3000);
		//Taking ScreenShot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Selenium\\ScreenShots\\twoplugs.png");
		FileUtils.copyFile(src,trg);
		
		
		// Get Title Using JSE
		String title = JavaScriptUtil.getTitle(driver);
		System.out.println(title);
		*/
		// Click Element by using JS
		WebElement logIn = driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li[1]/a[1]"));
		JavaScriptUtil.clikElement(logIn, driver);
		// Generate Alert using JSE
//		JavaScriptUtil.generateAlert(driver, "You are log in...");
		
		// Refreshing the page using JS
		Thread.sleep(3000);
		JavaScriptUtil.refreshBrowser(driver);
		
		
	}
	    
}
