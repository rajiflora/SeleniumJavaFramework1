package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsusingTestNGDemo {

	private static WebDriver driver=null;
	ExtentSparkReporter htmlreporter;
	ExtentReports extent;
	GoogleSearchPageObjects searchPageObj;
	
	@BeforeSuite
		public void setUp() {
		htmlreporter = new ExtentSparkReporter("Results/extenttestngresult.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test
	
	public void googleSearchTest() {
		ExtentTest test=extent.createTest("GoogleSearch","GoogleSearchFunctionalityTest");
		test.log(Status.INFO, "Starting Test Case");
		searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https:\\google.com");
		test.log(Status.PASS,"Opened the Google page");
		searchPageObj.setSearchString("Selenium");
		test.log(Status.PASS, "Search for Selenium");
		searchPageObj.clickSearchButton();
		test.log(Status.PASS, "Button Clicked");
		test.log(Status.INFO, "Test Completed Successfully");
	}
	
	@Test
	
	public void SeleniumWebsite() {
		ExtentTest test=extent.createTest("SeleniumWebsite","Navigating to Selenium Website Test");
		test.log(Status.INFO, "Starting Test Case");
		searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https:\\Selenium.dev");
		test.log(Status.PASS,"Opened the Selenium Website");
		test.log(Status.INFO, "Test Completed Successfully");
	}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
	}
		
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	
}
