package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_sendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
//		Thread.sleep(3000);
//		driver.close();
		
		WebElement UN =driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("abc");
		Thread.sleep(3000);
		
		UN.clear();
		Thread.sleep(2000);
		
		UN.sendKeys("xyz");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
