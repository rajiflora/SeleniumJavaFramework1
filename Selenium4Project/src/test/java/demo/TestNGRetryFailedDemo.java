package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		try {
		System.out.println("I am inside test2");
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = listenerspack.RetryAnalyzerDemo.class)
	public void test3() {
		System.out.println("I am inside test3");
		Assert.assertTrue(false);
	}

}
