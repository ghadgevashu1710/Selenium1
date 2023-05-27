package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_get {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	//create an object 
		driver.get("https://www.youtube.com");
		
	}

}
