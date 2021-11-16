package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="users") // dataProvider a parameter of @Test annotaion
	void logintest(String uname, String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}
	
	@DataProvider(name="users") // @DataProvider is annotation
	String [][] loginData()
	{
		String data[][]={ {"mercury","mercury"},{"mer","mer"},{"mercury1","mercury1"}};
		return data;
	}
	
	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}
}
