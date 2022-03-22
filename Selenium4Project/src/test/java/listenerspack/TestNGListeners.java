package listenerspack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("*** Test Started: "+result.getInstanceName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** onTestSuccess: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** onTestFailure: "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** onTestSkipped: "+result.getInstanceName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		System.out.println("*** onFinish: "+ context.getPassedTests());
	}
}
