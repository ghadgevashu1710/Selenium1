package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_ExpathByAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		//enter user name
//		driver.findElement("Locator Type");
//		driver.findElement(By.xpath("ExpathExpression"));	//tagName[@attributeName='attribute value'];
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ghadgevashu@gmail.com");
		Thread.sleep(3000);
	
		
//		//enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vashu@1710");
//		Thread.sleep(2000);
//		
//		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();
//		Thread.sleep(2000);
//		
//		//click on friends
//		driver.findElement(By.xpath("//a[@style='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x9f619 x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz x6s0dn4 x78zum5 xdt5ytf x5yr21d xl56j7k x1n2onr6 xh8yej3']")).click();
//		
	}

}
