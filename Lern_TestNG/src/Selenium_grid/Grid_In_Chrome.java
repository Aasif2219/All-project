package Selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_In_Chrome {
	
	static WebDriver driver;
	
	@Test(priority=1)
	void setup() throws MalformedURLException {
		
		//For grid
		String nodeURL = "http://192.168.225.46:31115/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL), cap);
	}
	
	@Test(priority=2)
	void login() {
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");
		driver.findElement(By.name("login")).click();
		
		String captext = driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
		
		if(captext.contains("pavanoltraining")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
			
	}

}
