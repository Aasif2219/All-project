package BarcodeAutomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QRCodeTest {

	public static void main(String[] args) throws IOException, NotFoundException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		String qrcodeURL = driver.findElement(By.xpath("//div[@id='HTML4']//img")).getAttribute("src");
		
		URL url = new URL(qrcodeURL);
		BufferedImage bufferedimage = ImageIO.read(url);
		
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		Result result = new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());

	}

}
