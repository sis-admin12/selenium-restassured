package selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHashMap {

	
	static HashMap <String,String> logindata()
	{
		HashMap <String,String> hm=new HashMap<String,String>();
		
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	}
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");// nu mai lucreaza situl
		
		String credentials=logindata().get("y");
		
		String uarr[]=credentials.split("@"); // splitting
		
		driver.findElement(By.name("userName")).sendKeys(uarr[0]);
		driver.findElement(By.name("password")).sendKeys(uarr[1]);
		driver.findElement(By.name("login")).click();
		
		if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test failed");

		}
		
		driver.findElement(By.linkText("Home")).click();
		
		
	}

}
