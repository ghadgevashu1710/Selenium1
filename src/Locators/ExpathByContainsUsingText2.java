package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpathByContainsUsingText2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//click on create new account link by using contains text
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		Thread.sleep(3000);
		driver.quit();
		//driver.close();
		
		
	}

}
