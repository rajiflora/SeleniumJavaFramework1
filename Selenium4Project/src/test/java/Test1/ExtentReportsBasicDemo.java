package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	static private WebDriver driver=null;

	public static void main(String[] args) {

		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Results/extentresult.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		ExtentTest test=extent.createTest("GoogleSearch","GoogleSearchFunctionalityTest");
		test.log(Status.INFO, "Starting Test Case");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https:\\google.com");
		test.log(Status.PASS,"Opened the Google page");
		searchPageObj.setSearchString("Selenium");
		test.log(Status.PASS, "Search for Selenium");
		searchPageObj.clickSearchButton();
		test.log(Status.PASS, "Button Clicked");
		driver.close();
		test.log(Status.INFO, "Test Completed Successfully");
		driver.quit();
		extent.flush();
		
	}

}
