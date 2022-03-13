package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_ExecutionPart2 {
	WebDriver driver;
	@Test(threadPoolSize = 3, invocationCount = 3)
	public void TC1() {
		System.out.println("This is TC1");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
	}

	@Test
	public void TC2() {
		System.out.println("This is TC2");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
	}

}
