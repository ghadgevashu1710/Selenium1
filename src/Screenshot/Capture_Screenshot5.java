package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot5 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//take a screenshot of this page
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\f1.jpeg");
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		
		File dest1=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\f2.jpeg");
		FileHandler.copy(src1, dest1);
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src2);
		
		File dest2=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\f3.jpeg");
		FileHandler.copy(src2, dest2);
	}

}
