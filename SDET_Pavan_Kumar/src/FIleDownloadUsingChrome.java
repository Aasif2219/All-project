import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIleDownloadUsingChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("textbox")).sendKeys("Aasif");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

	}
}
