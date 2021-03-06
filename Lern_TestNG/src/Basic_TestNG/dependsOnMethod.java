package Basic_TestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependsOnMethod {
	public static WebDriver driver;
	
	public static Logger logger=Logger.getLogger("Log4j.properties");
 
	@BeforeTest
	public void Start() {
	
    WebDriverManager.chromedriver().setup();
    logger.info("Launching Chrome Driver...");
    driver = new ChromeDriver();
    logger.info("Maximize window...");
    driver.manage().window().maximize();
    logger.info("Launching URL...");
    driver.get("https://www.mycarhelpline.com/");
	}
	
	@Test(priority=1)
	public void LoadingPage(){
		
		
		
	System.out.println(driver.getCurrentUrl());
	logger.info("Get Current URL");
	String CurrentURL = "https://www.mycarhelpline.com/";
	if(CurrentURL.equals("https://www.mycarhelpline.com/")) {
		System.out.println("Test is PASS");
	}else {
		System.out.println("Test is FAIL");
	}
//	Assert.fail();
	}
	@Test(priority=2,dependsOnMethods="LoadingPage",alwaysRun= true)
	public void Calculator(){
	driver.findElement(By.linkText("Calculator")).click();
	}
	@Test(priority=3,dependsOnMethods={"LoadingPage","Calculator"})
	public void NewCar(){
	driver.findElement(By.linkText("New Car")).click();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
}
