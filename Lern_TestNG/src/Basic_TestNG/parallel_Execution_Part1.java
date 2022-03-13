package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_Execution_Part1 {
	WebDriver driver;
	@Test(threadPoolSize = 3, invocationCount = 3)
	public void TC1() {
		System.out.println("This is TC1");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://Google.com");
	}

	@Test
	public void TC2() {
		System.out.println("This is TC2");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void TC3() {
		System.out.println("This is TC3");
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}		
	
}
