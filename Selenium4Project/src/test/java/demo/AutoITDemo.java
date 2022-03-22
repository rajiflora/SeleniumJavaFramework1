package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	public static String browserName=null;
	static private WebDriver driver=null;
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		try {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		
		driver.get("https://demo.jirafeau.net/");
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
		Runtime.getRuntime().exec("C:\\Users\\MARK\\JavaProjects\\FileUploadScript.exe");
		Thread.sleep(3000);
	
		}
		catch(Exception e) {
			System.out.println("Message is :"+e.getMessage());
			System.out.println("Cause is :"+e.getCause());
			e.printStackTrace();
		}
	}
}	
