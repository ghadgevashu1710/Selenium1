package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpathByText_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		//click on forgott password link by using xpath by text method
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
	}

}
