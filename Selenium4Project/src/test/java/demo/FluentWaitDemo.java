package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	public static String browserName=null;
	static private WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(2L))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement linkElement= driver.findElement(By.linkText("ABCD - NIMH Data Archive"));
			       if(linkElement.isEnabled()) {
			    	   System.out.println("Element Found");
			       }
			       return linkElement;
			     }
			   });
			   element.click();
			 
		driver.close();
		driver.quit();
		
	}
	
}
