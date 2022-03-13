package StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleException {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Online Training']"));
        link.click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        
        try {
        	link.click();
        }
        catch(StaleElementReferenceException e)
        {
        	link = driver.findElement(By.xpath("//a[normalize-space()='Online Training']"));
            link.click();
        }
	}

}
