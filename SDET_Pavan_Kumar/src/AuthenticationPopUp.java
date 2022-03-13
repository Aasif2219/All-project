import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
	}

}
