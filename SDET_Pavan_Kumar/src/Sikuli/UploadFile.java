package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();
//		Thread.sleep(2000);
		
//		driver.switchTo().frame("frame-one1434677811");
//		driver.findElement(By.id("RESULT_FileUpload-10")).click();
//		driver.findElement(By.xpath("//h2[normalize-space()='Alert']")).click();
	
	}

}
