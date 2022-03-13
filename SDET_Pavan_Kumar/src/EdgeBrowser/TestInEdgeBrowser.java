package EdgeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    String expTitle = "OrangeHRM";
	    
	    String actTitle = driver.getTitle();
	    
	    if(expTitle.equals(actTitle)==true) {
	    	System.out.println("Pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
	}

}
