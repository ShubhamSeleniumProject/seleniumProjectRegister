package com.tyss.genericutility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClassUtility implements ITestListener,ISuiteListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"bug");
		
		test.log(Status.FAIL,"failed test case");
		
		
	}
	
	
	
	
	
	

}
