package Basic_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_priority_enabled {
	
	//If you do not set priority of test cases then it will be execute Alphabetical order.
	//Set all of all test cases otherwise it's again execute Alphabetical order.
	
	@Test(priority=1)
	public void RegisterUser() {
		System.out.println("RegisterUser");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods="RegisterUser",alwaysRun=true)
	public void ValidLogin() {
		System.out.println("ValidLogin");
	}

	@Test(priority=3,dependsOnMethods={"RegisterUser","ValidLogin"},alwaysRun=true)
	public void HomePage() {
		System.out.println("HomePage");
	}

	@Test(priority=4,dependsOnMethods={"RegisterUser","ValidLogin","HomePage"},alwaysRun=true)
	public void AddBenificiary() {
		System.out.println("AddBenificiary");
	}

	@Test(priority=5,dependsOnMethods={"RegisterUser","ValidLogin","HomePage","AddBenificiary"})
	public void ValidateBenificiary() {
		System.out.println("ValidateBenificiary");
	}

	@Test(priority=6,dependsOnMethods={"RegisterUser","ValidLogin","HomePage","AddBenificiary","ValidateBenificiary"})
	public void Logout() {
		System.out.println("Logout");
	}


}
