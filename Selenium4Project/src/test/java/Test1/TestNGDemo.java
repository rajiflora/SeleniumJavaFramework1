package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesDemo;
import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	
	public static String browserName=null;
	static private WebDriver driver=null;
	
	@BeforeTest
	
	public void setUpTest() {
		
		PropertiesDemo.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	
	public static void googleSearch() {
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https:\\google.com");
		searchPageObj.setSearchString("Selenium");
		searchPageObj.clickSearchButton();
	}
	
	@AfterTest
	
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	
}
