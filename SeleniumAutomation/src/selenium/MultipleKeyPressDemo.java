package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeyPressDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.walmart.com/ip/Chromecast-with-Google-TV-Streaming-Entertainment-in-4K-HDR-Snow/403830906?irgwc=1&sourceid=imp_0jfTezzo5xyLTq6wUx0Mo3EHUkE1ln3BiSu7wY0&veh=aff&wmlspartner=imp_159047&clickid=0jfTezzo5xyLTq6wUx0Mo3EHUkE1ln3BiSu7wY0&sharedid=&ad_id=568844&campaign_id=9383");

		//driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL+"a").build().perform();

	}

}
