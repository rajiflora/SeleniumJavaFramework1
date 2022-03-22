package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultibrowserDemo {
	
	public static String browserName=null;
	static private WebDriver driver=null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUpTest(String browserName) {
		System.out.println("Browser Name is :" +browserName);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
	}
	
	@Test
	public void Test() {
		driver.get("https://google.com/");
	}
	
	@AfterTest
	public void teardownTest() {
		driver.close();
	}
}
