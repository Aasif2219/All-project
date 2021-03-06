import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Sorting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);
		List originalList = new ArrayList();
		List<WebElement>options=se.getOptions();
		
		for(WebElement e:options) 
		{
			originalList.add(e.getText());
		}
		System.out.println("Option are "+originalList);
		
		
	}

}
