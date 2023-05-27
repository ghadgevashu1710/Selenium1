package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot4 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\abc.jpeg");
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		
		File dest1=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\abc1.jpeg");
		FileHandler.copy(src1, dest1);
	}

}
