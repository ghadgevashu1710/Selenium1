package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(300);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.close();
				
	}

}
