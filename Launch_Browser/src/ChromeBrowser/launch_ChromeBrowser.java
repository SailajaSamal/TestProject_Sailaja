package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_ChromeBrowser {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("WebDriver.Chrome.driver","C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://Facebook.com");
		Thread.sleep(2000);
		driver.close();
		
      
	}

}
