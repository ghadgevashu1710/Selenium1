package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingText1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("Https://facebook.com");
		Thread.sleep(3000);
		
		//click on forgotton button using contains text
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		
		
	}

}
