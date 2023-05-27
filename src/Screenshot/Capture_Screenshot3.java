package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot3 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	File dest=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\a1.jpeg");
	FileHandler.copy(src, dest);
	
//	Thread.sleep(3000);
	//click on create new acount link
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//driver.get("https://flipkart.com");
	
	Thread.sleep(300);
	
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src1);
	
	File dest1=new File("E:\\\\Velocity Testing\\\\Automation Testing\\\\Screenshots\\\\b1.jpeg");
	FileHandler.copy(src1, dest1);
		
	}

}
