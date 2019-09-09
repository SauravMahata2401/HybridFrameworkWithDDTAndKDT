package com.mvn.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mvn.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void loginAsManager() {
		
		log.debug("Inside Test");
		driver.findElement(By.xpath(OR.getProperty("bml_login"))).click();
		log.debug("Clicked on Bank Manager Login Button");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("add_custBtn"))),"Button not found or Login Button clicked failed");
		log.debug("Button is displayed Assertion Passed");
	}
	
	

}
