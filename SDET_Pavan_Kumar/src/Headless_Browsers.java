import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browsers {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://Google.com");
		System.out.println("Title of Page is : " +driver.getTitle());
	}

}
