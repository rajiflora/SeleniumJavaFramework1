package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.GoogleSearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemp {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		GoogleSearchpage.textbox_search(driver).sendKeys("Test");
		GoogleSearchpage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();	
	}

}
