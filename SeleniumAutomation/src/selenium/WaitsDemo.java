package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // implicit wait
		
		driver.get("http://newtours.demoaut.com/");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
	}

}
