package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Velocity%20Testing/Automation%20Testing/HTML%20Programs/PartiaLinkText.html");
		Thread.sleep(3000);
		
		//click on facebook link
		driver.findElement(By.partialLinkText("ceb")).click();
		
	}

}
