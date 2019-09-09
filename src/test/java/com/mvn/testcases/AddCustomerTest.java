package com.mvn.testcases;

import org.testng.annotations.Test;

import com.mvn.base.TestBase;

public class AddCustomerTest extends TestBase{
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName, String postCode) {
		
		
	}
	
	
	public Object[][] getData(){
		
	}

}
