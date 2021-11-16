package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginTest_OrangeHRM {

	public static void main(String[] args) {
		
		// open web browser(Chrome)
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver(); //se poate si asa
		WebDriver driver=new ChromeDriver();
		
		// open web browser(FireFox)
		/*System.setProperty("webdriver.gecko.driver", "C://Users//Serghei.Matura//Driver//driver_mozila/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();*/
				
		// open web browser(IE)
		/*System.setProperty("webdriver.ie.driver", "C://Users//Serghei.Matura//Driver//driver_IExplorer//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/

		//Open URL  https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Enter username  (Admin)
		//WebElement username=driver.findElement(By.id("txtUsername"));//gaseste elementul web dupa ID
		//username.sendKeys("Admin");// scrie in username Admin
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Enter password  (admin123)
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Click Login
		driver.findElement(By.name("Submit")).click();
		
		//Capture title of the home page
		String titlu_real=driver.getTitle();
		String titlu_asteptat="OrangeHRM";
		
		//Verify title of the page: OrangeHRM 
		if(titlu_asteptat.equals(titlu_real))
		{
			System.out.println("Titlul coincide!");
		}
		else
		{
			System.out.println("Titlul NU coincide!");
		}
		
		
		//Close browser
		driver.close();
		
		
	}

}
