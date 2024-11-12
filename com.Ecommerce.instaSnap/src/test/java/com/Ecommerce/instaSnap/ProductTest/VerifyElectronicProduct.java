package com.Ecommerce.instaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.instaSnap.GenericLibrary.BaseTest;

public class VerifyElectronicProduct extends BaseTest {
	@Test(priority = 1)
	public void createProduct()jhuhiu
	{
	Reporter.log("Electronic Product Created", true);	
	}
	@Test(priority = 2,invocationCount = 2,dependsOnMethods = "createProduct")
	public void updateProduct()
	{
		Reporter.log("Electronic Product Updated", true);		
	}

}
