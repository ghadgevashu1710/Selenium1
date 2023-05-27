package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_SwitchToFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click on "click to me on" from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//click on menu option
		driver.findElement(By.xpath("//a[@title='Open Menu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Go to Spaces']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().frame("")
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ghadgevashu@gmail.com");
		
		
		
	}

}
