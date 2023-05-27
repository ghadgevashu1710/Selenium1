package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Velocity%20Testing/Automation%20Testing/HTML%20Programs/ClassName.html");
		Thread.sleep(3000);
	
		//enter FN by using ClassName
		driver.findElement(By.className("abc123")).sendKeys("Vashishtha");
		Thread.sleep(3000);
		
		//enter LN by using ClassName
		driver.findElement(By.className("xyz123")).sendKeys("Ghadge");
		
		
	}

}
