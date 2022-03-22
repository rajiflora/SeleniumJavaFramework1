package Test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchpage;

public class GoogleSearchTest {

	static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://google.com");
		GoogleSearchpage.textbox_search(driver).sendKeys("Test");
		GoogleSearchpage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Success");
	
	}

}
