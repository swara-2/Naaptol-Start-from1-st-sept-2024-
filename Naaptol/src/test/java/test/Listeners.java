package test;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener {
	public void  TestStart(ITestResult result) {
		System.out.println("Test Started"+result.getName());
	}
	public void  TestSuccess(ITestResult result) {
		System.out.println("Test Passed"+result.getName());
	}
	public void  Failure(ITestResult result) {
		System.out.println("Test Failed"+result.getName());
		try {
			Screenshot.TakeScreenshot(driver,result.getName());
		}catch(IOException e)
		{
			e.printStackTrace();	
		}
		}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped"+result.getName());
	}

}
