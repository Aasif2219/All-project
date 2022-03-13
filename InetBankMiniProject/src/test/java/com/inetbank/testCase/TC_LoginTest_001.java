package com.inetbank.testCase;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbank.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass1 {
	
	@Test
	public void loginTest() throws IOException {
	
	logger.info("Launching Logging Page...");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered Username");
	lp.setPassword(password);
	logger.info("Entered Password");
	
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		captureScreen(driver,"loginTest");
		logger.info("Test failed");
		Assert.assertTrue(false);
		
	
	}
	
	}
	

}
