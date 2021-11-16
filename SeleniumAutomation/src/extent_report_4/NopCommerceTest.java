package extent_report_4;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NopCommerceTest {

	public WebDriver driver;
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output/MyReport.html");
		
		htmlReporter.config().setDocumentTitle("Automation Report");// Title of the report
		htmlReporter.config().setReportName("Functional Report");//Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester Name", "Sergiu");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
	}
	
	@Test
	public void noCommerceTitleTest()
	{
		test=extent.createTest("TitleTest");
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demoo store");
	}
	
	@Test
	public void noCommerceLogoTest()
	{
		test=extent.createTest("LogoTest");
		
		Boolean status=driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	
	@Test
	public void noCommerceLoginTest()
	{
		test=extent.createTest("LoginTest");
		
		test.createNode("Login with valid input");
		Assert.assertTrue(true);
		
		test.createNode("Login with invalid input");
		Assert.assertTrue(true);
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report

			String screenshotPath = NopCommerceTest.getScreenshot(driver, result.getName());

			test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
			
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} 
		else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		driver.quit();
	}
	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		// after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	
}
