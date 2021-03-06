package com.inetbank.testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbank.PageObject.AddCustomerPage;
import com.inetbank.PageObject.LoginPage;

public class TC_AddCostomerTest_003 extends BaseClass1{
	
	@Test
	public void addNewCostomer() throws InterruptedException, IOException
	{
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	Thread.sleep(3000);
	
	AddCustomerPage addcust = new AddCustomerPage(driver);
	addcust.clickAddNewCustomer();
	
	logger.info("providing customer details....");
	
	
	addcust.custName("Aasif");
	addcust.custgender("male");
	addcust.custdob("22","05","1995");
	Thread.sleep(5000);
	addcust.custaddress("INDIA");
	addcust.custcity("MAH");
	addcust.custstate("MH");
	addcust.custpinno("123456");
	addcust.custtelephoneno("987890091");
	
	String email=randomestring()+"@gmail.com";
	addcust.custemailid(email);
	addcust.custpassword("abcdef");
	addcust.custsubmit();
	
	Thread.sleep(3000);
	
	logger.info("validation started....");
	
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if(res==true)
	{
		Assert.assertTrue(true);
		logger.info("test case passed....");
		
	}
	else
	{
		logger.info("test case failed....");
		captureScreen(driver,"addNewCostome");
		Assert.assertTrue(false);
	}
	
	
	
	}
	
	

}
