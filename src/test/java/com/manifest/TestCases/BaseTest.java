package com.manifest.TestCases;

import org.testng.annotations.AfterSuite;

import com.manifest.Base.Page;


public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
