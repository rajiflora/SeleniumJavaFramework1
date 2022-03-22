package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test1.TestNGDemo;

public class PropertiesDemo {
	static Properties prop=new Properties();
	static String Path=System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	
	}	
		public static void getProperties(){
			try {
			InputStream IS=new FileInputStream( Path + "/src/test/java/Config/config.properties");
			prop.load(IS);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestNGDemo.browserName=prop.getProperty("browser");
			}
			catch(Exception e) {
				System.out.println("Message is :" +e.getMessage());
				System.out.println("Message is :" +e.getCause());
				e.printStackTrace();
				}
			}
		public static void setProperties(){
			try {
			OutputStream OS=new FileOutputStream( Path + "/src/test/java/Config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(OS, null);
			}
			catch(Exception e) {
				System.out.println("Message is :" +e.getMessage());
				System.out.println("Message is :" +e.getCause());
				e.printStackTrace();
				}
			}
}
