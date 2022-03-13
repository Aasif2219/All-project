package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/input.html");
			
			Actions act = new Actions(driver);
			
			WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
            act.contextClick(btn).build().perform();
            
            driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-input']//span[contains(text(),'Radio3')]")).click();
            
	}

}
