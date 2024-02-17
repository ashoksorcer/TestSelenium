package com.hyr.Others;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestStatusListener extends Base implements ITestListener {

	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+ "test case failed");
		try {
			FailedScreenshot(result.getName());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
