package allureReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Tests {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();  
	}
	
	@Test(priority=1, description="Verify Logo presence on home page")
	@Description("Verify Logo presence on home page.....")
	@Epic("EP001")
	@Feature("Feature1:Logo")
	@Story("Logo:Presence")
	@Step("Verify logo presence")
	@Severity(SeverityLevel.MINOR)
	public void logoPresence()
	{
		Boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=2)
	@Description("Verify Login test.....")
	@Epic("EP001")
	@Feature("Feature2:Logo")
	@Story("Logo:Presence")
	@Step("Verify logo presence")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("AasifShaikh12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store123");
		
	}
	
	@Test(priority=3)
	@Description("Verify User registration.....")
	@Epic("EP001")
	@Feature("Feature3:Logo")
	@Story("Logo:Presence")
	@Step("Verify logo presence")
	@Severity(SeverityLevel.NORMAL)
	public void registrationTest() {
		throw new SkipException("Skipping this test");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
