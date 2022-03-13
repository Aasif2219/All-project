package Basic_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization_using_XML {
	public static WebDriver driver;
	@Test
	@Parameters({"url","emailid","password"})
	public void Rediff(String url,String emailid,String password) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys(emailid);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("signinbtn")).click();
	driver.findElement(By.className("rd_logout")).click();

	}
	}
