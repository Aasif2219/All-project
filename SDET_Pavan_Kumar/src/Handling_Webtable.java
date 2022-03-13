import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Webtable {
	public static <WebElement> void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aasif/OneDrive/Desktop/Git%20Practice/Table.html");
		
		org.openqa.selenium.WebElement r = driver.findElement(By.xpath("/html/body/table/tbody/tr"));
		Dimension rowcount = r.getSize();
		System.out.println(rowcount);
	}

}
