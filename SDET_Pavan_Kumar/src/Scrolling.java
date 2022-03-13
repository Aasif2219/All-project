import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
/*		 //1.Scroll down by pixel
		 js.executeScript("window.scrollBy(0,2000)","");
		 
		 //2.Scroll down till element not found
		 WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		 js.executeScript("arguments[0].scrollIntoView();",flag);
		 */

		 //3.Scroll down till web page end
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
