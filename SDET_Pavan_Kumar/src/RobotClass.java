import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;	
import java.awt.Robot;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://spreadsheetpage.com/calendar/yearly/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Download this template for free']")).click();

		Robot robot = new Robot();
		
	}

}
