package encodeAndDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseToDecodePass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aasifshaikh2205@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("QWFzaWZAMTIz"));
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

	}
	
	static String decodeString(String password) {
	byte[] decodedString = Base64.decodeBase64(password);
	 return new String(decodedString);
	}
}
