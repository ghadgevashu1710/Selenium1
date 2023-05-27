package Installation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2_OpenFirefoxBrowser {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}

}
