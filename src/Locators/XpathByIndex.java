package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//click on create new account link by using index
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		//enter first name by using index of [2]
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Vashishtha"); //using index of [2]
		Thread.sleep(3000);
		
		//enter last name by using index of [3]
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ghadge");
		Thread.sleep(3000);
		
		//enter mail id by using index of [4]
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8149248408");
		Thread.sleep(3000);
		
		//enter new password
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])")).sendKeys("Vashu@1710");
		
	}
	

}
