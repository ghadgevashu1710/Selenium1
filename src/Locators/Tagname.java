package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Velocity%20Testing/Automation%20Testing/HTML%20Programs/Tagname.html");
		
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("Vashishtha");
		
		//enter LN
		driver.findElement(By.tagName("input")).sendKeys("Ghadge");		//same tagname will not perform the page
		
	}

}
