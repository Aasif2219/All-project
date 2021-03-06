import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllOption {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(driver.findElement(By.id("animals")));
		List<WebElement>options=se.getOptions();
		int size = options.size();
		System.out.println("Number of Options are:" +size);
		for(int i=0;i<size; i++) {
	         String option = options.get(i).getText();
	         System.out.println(option);
		}
		driver.quit();

	}

}
