package CookiesTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Set<Cookie>cookies=driver.manage().getCookies();
		
		//Print size of all cookies
		System.out.println("Size of cookie :"+cookies.size());
		
		//Print Name and Value of all cookies
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}*/
		
		//Print specific cookies according to the name
//		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		// Add the new cookie 
		Cookie obj = new Cookie("MyCookies1234","12345678");
		driver.manage().addCookie(obj);
		cookies=driver.manage().getCookies();
		
		System.out.println("Size of cookie after adding :"+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		//Delete cookie by name
		driver.manage().deleteCookieNamed("session-id-time");
		cookies=driver.manage().getCookies();
		
		System.out.println("Size of cookie after Deleting :"+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}

	}

}
