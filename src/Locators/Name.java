package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///E:/Velocity%20Testing/Automation%20Testing/HTML%20Programs/Name.html");
		Thread.sleep(3000);
		
		//enter FN by using name locator
		driver.findElement(By.name("xyz123")).sendKeys("Vashishtha");
		Thread.sleep(3000);
		
		//enter LN by using name locator
		driver.findElement(By.name("xyz123")).sendKeys("Ghadge");
		Thread.sleep(3000);
	}

}
