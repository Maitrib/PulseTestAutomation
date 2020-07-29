/**
 * 
 */
package com.manifest.TestCases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.manifest.Base.Page;
import com.manifest.Pages.LoginPage;
import com.manifest.Utilities.TestUtil;


/**
 * @author maitri.brahmakshatriya
 *
 */

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException{
		
		LoginPage lp = new LoginPage();
		lp.loginPage(data.get("username"), data.get("password"));
		
		//Assert.fail("Login test failed");
		
		
	}

}
