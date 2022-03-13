package Basic_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeM_Test_AM {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is BeforeMethod");
	}
	
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	@Test
	public void test2() {
		System.out.println("This is Test2");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("This is AfterMethod");

	}
}
