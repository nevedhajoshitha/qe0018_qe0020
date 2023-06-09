package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	public void onStart(ITestContext c) {
		System.out.println("On Start of method");
	}
	
	public void onFinish(ITestContext c) {
		System.out.println("On Finish of method");
	}
	
	public void onTestStart(ITestResult r) {
		System.out.println(" Start of test" + r.getName());
	}
	
	public void onTestSuccess(ITestResult r) {
		System.out.println(" Pass of test");
	}
	
	public void onTestFailure(ITestResult r) {
		System.out.println(" Failure of test");
	}
	
	public void onTestSkipped(ITestResult r) {
		System.out.println(" Skip of test");
	}
}
