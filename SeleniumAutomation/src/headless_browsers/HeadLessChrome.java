package headless_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {

		//set the driver server exe path
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
				
		// set chrome as Headless
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true); 	//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);		//Instantiate Chrome Driver
		
		
		driver.get("http://demo.nopcommerce.com/");
						
		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("URL of the page:" + driver.getCurrentUrl());
			
	}

}
