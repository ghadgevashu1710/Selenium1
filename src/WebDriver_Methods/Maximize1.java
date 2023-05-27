package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
//		Options s1=driver.manage();
//		Window s2=s1.window();
//		s2.maximize();
		
	}
	
}
