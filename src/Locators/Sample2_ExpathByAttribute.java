package Locators;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_ExpathByAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//xpath by attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vashu@1710");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//xpath by text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		
		//xpath by text
		driver.findElement(By.xpath("//a[text()='Create new account']")).clear();
		
		
	}

}
