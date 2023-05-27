package Installation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Example1_OpenChromeBrowser {
	
	public static void main(String[] args) {
		
//		System.setProperty(null, null)
//		System.setProperty("webdriver.chromedriver", "path of ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();	//object an ChromeDriver
		FirefoxDriver d=new FirefoxDriver();	////object an FirefoxDriver
		driver.get("https://www.google.com");
		d.get("https://www.facebook.com");
//		d.get("id=email");
	}

}
