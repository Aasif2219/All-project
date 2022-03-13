import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//1st frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//2nd frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='Alert']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//3rd frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
        
		Thread.sleep(5000);
		driver.close();
	}

}
