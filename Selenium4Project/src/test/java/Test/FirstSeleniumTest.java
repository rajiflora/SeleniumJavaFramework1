package Test;

//import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://google.com");
		String OriginalWindow= driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(OriginalWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("./image1.png"));
		WebElement element= driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image2.png"));*/
		driver.navigate().to("https://google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click()",button);
		Thread.sleep(3000);
		js.executeScript("console.log('Test')");
		//Thread.sleep(3000);
		//driver.quit();
	}

}
