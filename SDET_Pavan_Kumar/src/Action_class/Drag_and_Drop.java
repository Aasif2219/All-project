package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("box1"));
		
		WebElement target = driver.findElement(By.id("box103"));
		
		act.clickAndHold(source).moveToElement(target).release().build().perform();
//		              or
//		act.dragAndDrop(source, target).build().perform();
		
	}

}
