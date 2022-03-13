package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	
		WebElement button = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);

		Thread.sleep(3000);
		String inputFilePath = "C:\\Users\\aasif\\OneDrive\\Desktop\\";
		
		Screen s = new Screen();
		
		Pattern fileInputTextBox = new Pattern(inputFilePath+"TextBox.JPG");
		Pattern openButton = new Pattern(inputFilePath+"Button.JPG");
		
		Thread.sleep(3000);
		s.wait(fileInputTextBox,20);
		s.type(fileInputTextBox,inputFilePath+"Green.PNG");
		s.click(openButton);
	}

}
