package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_sendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("abc");
		Thread.sleep(3000);
		
	
		
	}

}
