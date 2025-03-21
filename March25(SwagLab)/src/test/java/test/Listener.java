package test;

import org.testng.ITest;
import org.testng.ITestListener;

public class Listener implements ITestListener{
	public void onTestStart(ITest result) {
		System.out.print("test started"+result.getTestName());
	}
	public void onTestSuccess(ITest result) {
		System.out.print("test success"+result.getTestName());
	}
	public void onTestFailuer(ITest result) {
		System.out.print("test fail"+result.getTestName());
	}
	public void onTestSkipped(ITest result) {
		System.out.print("test skipped"+result.getTestName());
	}
	

}
