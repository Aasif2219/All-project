package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUploadChrome {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("imagesrc"))).perform();
		Runtime.getRuntime().exec("C:\\Users\\aasif\\OneDrive\\Desktop\\FileUpload1.exe");
	}

}
