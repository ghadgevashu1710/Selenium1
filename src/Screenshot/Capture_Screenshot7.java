package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Capture_Screenshot7 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		String RS = RandomString.make(3);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\a"+RS+".jpeg");
		FileHandler.copy(src, dest);
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ghadgevashu@gmail.com");
		
		String rs=RandomString.make(3);
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		
		File dest1=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\a"+rs+".jpeg");
		FileHandler.copy(src1, dest1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		String Rs=RandomString.make(3);
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src2);
		
		File dest2=new File("E:\\Velocity Testing\\Automation Testing\\Screenshots\\a"+Rs+".jpeg");
		FileHandler.copy(src2, dest2);
		
		Thread.sleep(2000);
		driver.close();
	}

}
