package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Minimize1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().minimize();
		
		//Thread.sleep(3000);
		
//		Options s1=driver.manage();
//		Window s2=s1.window();
//		s2.minimize();
		
	}

}
