package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	
	public static String browserName=null;
	static private WebDriver driver=null;
	
	public static void main(String[] args) {
		seleniumWaits();
	}

	public static void seleniumWaits() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		
		driver.close();
		driver.quit();
		
}
	
}
