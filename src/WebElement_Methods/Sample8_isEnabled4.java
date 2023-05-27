package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8_isEnabled4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(300);
		
		
	}

}
