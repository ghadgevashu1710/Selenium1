package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		Thread.sleep(3000);
		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(3000);
		
		//enter password
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("Vashu@1710");
		Thread.sleep(3000);
		
		//click on login btn
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		
	}

}
