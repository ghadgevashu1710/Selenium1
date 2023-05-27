package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Istagram_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		//Enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(3000);
		
		//enter Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vashu@1710");
		Thread.sleep(3000);
		
		//click login btn
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
