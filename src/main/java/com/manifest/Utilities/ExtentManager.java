/**
 * 
 */
package com.manifest.Utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author maitri.brahmakshatriya
 *
 */
public class ExtentManager {
	
	public static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		
		if(extent==null) {
			
			extent = new ExtentReports(System.getProperty("user.dir")+"/extent.html",true,DisplayOrder.OLDEST_FIRST);;
			extent.loadConfig(new File(System.getProperty("user.dir")+"/src/test/resources/extentconfig/ReportsConfig.xml"));
		}
		return extent;
		
	}

}
