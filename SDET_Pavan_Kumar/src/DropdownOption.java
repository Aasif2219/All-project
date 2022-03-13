import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOption {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.id("animals"));
		
		Select se = new Select(element);
		
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		
		
		List<WebElement>options=se.getOptions();
		
		for(WebElement e:options) 
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before Sorting OrigionalList "+originalList);
		System.out.println("Before Sorting tempList "+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting OrigionalList "+originalList);
		System.out.println("After Sorting tempList "+tempList);
		
		if(originalList==tempList) {
			System.out.println("Dropdown sorted");
		}
		else {
			System.out.println("Dropdown Not sorted");
		}
		driver.close();
	}

}
