import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_links {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		Thread.sleep(5000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(3000);
			httpConn.connect();
			
			int rescode=httpConn.getResponseCode();
			
			if(rescode>=400) {
				System.out.println(url +"-" + "is brokrn link");
			}
			else {
				System.out.println(url +"-" + "is Valid link");
			}
			
		}
		

	}

}
