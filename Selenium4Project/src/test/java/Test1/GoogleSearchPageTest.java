package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static private WebDriver driver=null;
	public static void main(String[] args) {
		GoogleSearch();
		
	}
	public static void GoogleSearch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https:\\google.com");
		searchPageObj.setSearchString("Selenium");
		searchPageObj.clickSearchButton();
		driver.close();
		
	}

}
