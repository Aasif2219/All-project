package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUpload {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement button = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		
		Runtime.getRuntime().exec("C:\\Users\\aasif\\OneDrive\\Desktop\\FileUpload.exe");

	}

}
