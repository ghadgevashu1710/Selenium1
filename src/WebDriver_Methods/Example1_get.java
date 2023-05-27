package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_get {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); //upcasting in selenium using interface method
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//driver.getTitle("");
		driver.close();
		
		
	}

}
