import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUsingFirefox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		//For text file
		Thread.sleep(2000);
		driver.findElement(By.id("textbox")).sendKeys("This is Text Testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		
		//For PDF file
		Thread.sleep(2000);
		driver.findElement(By.id("pdfbox")).sendKeys("This is PDF Testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();


	}

}
