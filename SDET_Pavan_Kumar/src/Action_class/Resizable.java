package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(resizable).dragAndDropBy(resizable, 100, 100).build().perform();

	}

}
