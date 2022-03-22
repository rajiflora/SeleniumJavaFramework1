package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null;
	By textbox_search=By.name("q");
	By button_click=By.name("q");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setSearchString(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButton() {
		driver.findElement(button_click).sendKeys(Keys.RETURN);
	}
	
}
