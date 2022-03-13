package Basic_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	@BeforeSuite
	public void beforeSuit(){
		System.out.println("This is beforeSuit annotation");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is beforeTest annotation");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("This is beforeClass annotation");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is beforeMethod annotation");
	}
	
	@Test
	public void Test(){
		System.out.println("This is Test annotation");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is afterMethod annotation");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("This is afterClass annotation");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("This is afterTest annotation");
	}
	
	@AfterSuite
	public void afterSuit(){
		System.out.println("This is afterSuit annotation");
	}
	

}
