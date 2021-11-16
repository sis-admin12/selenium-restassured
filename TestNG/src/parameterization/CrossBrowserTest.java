package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver=null;
	
	
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br) {

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Serghei.Matura\\Driver\\driver_mozila/geckodriver.exe");
				driver=new FirefoxDriver();
			}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Serghei.Matura\\Driver\\driver_IExplorer/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get("http://newtours.demoaut.com/");
		
	}

	@Test(priority=2)
	public void verifyTitle() {
		
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
	}

	@Test(priority=3)
	public void registration() {

		Assert.assertTrue(true);
		//write code for registratio process
	}

	@Test(priority=4)
	public void closeBrowser() {

		driver.close();
	}

}
