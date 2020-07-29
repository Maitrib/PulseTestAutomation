/**
 * 
 */
package com.manifest.Pages;

import com.manifest.Base.Page;


/**
 * @author maitri.brahmakshatriya
 *
 */
public class LoginPage extends Page{

	public DashboardPage loginPage(String username,String password) {
		
		type("username_xpath",username);
		type("password_xpath",password);
		click("signInBtn_xpath");
		
		return new DashboardPage();
		
	}

}
