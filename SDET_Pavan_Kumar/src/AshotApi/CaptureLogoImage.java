package AshotApi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement logoImageElement = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	    
	    Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
	    ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C:\\Selenium\\ScreenShots\\Logos\\OrangeHRMLogo.png"));
	    
	    File f = new File("C:\\Selenium\\ScreenShots\\Logos\\OrangeHRMLogo.png");
	    
	    if(f.exists()) 
	    {
	    	System.out.println("File exist");
	    }
	    else 
	    {
	    	System.out.println("File Not exist");
	    }

	}

}
