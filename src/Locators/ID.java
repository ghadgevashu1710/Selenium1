package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Velocity%20Testing/Automation%20Testing/HTML%20Programs/Id.html");
		Thread.sleep(3000);
		
		//enter FN
		driver.findElement(By.id("1234")).sendKeys("Vashishtha");
		Thread.sleep(3000);
		
		//enter LN
		driver.findElement(By.id("12345")).sendKeys("Ghadge");
		
		
		
	}
	
}
