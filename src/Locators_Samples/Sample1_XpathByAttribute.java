package Locators_Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_XpathByAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		//get url
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//xpath by attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(3000);
		
		//xpath by attribute
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vashu@1710");
		Thread.sleep(3000);
		
		//xpath by attribute
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		Thread.sleep(3000);
		
		//xpath by text
//		driver.findElement(By.xpath("//span[text()='Friends']")).click();
//		Thread.sleep(3000);
		
		//xpath by contains with text, partial text
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		Thread.sleep(3000);
		
		
	}

}
