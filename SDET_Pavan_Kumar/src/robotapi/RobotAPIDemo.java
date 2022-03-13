package robotapi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotAPIDemo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://spreadsheetpage.com/calendar/yearly/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Download this template for free']")).click();


	}

}
