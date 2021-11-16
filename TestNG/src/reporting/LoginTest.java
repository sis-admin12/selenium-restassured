package reporting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		//driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void loginTest()
	{
		driver.get("https://www.curs.md/ro");
		//driver.driver.findElement(By.name("userName")).sendKeys("mercury");
		//driver.findElement(By.name("password")).sendKeys("mercury");
		//driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Curs.md - Curs valutar");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot file
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("screenshot catured");
		}
	}
	}
	
	