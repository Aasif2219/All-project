import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    Actions act = new Actions(driver);
	    
	    WebElement marketplace = driver.findElement(By.id("MP_link"));
	    act.moveToElement(marketplace).build().perform();

	}

}
