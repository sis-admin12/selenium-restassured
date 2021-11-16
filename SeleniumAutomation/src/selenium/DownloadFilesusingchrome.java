package selenium;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFilesusingchrome {

	public static void main(String[] args) throws InterruptedException {
	
		
		//download files in required location using chrome
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.prompt_for_download", "false");
		chromePrefs.put("download.default_directory","C:\\Downloadedfiles"); //configure path

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);  // end of code
		
			
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver(cap);
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("testing txt file download");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		Thread.sleep(5000);
		
		if(isFileExist("C://Downloadedfiles/info.txt"))
		{
			System.out.println(" file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
		//download pdf file
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf downlaod");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		Thread.sleep(5000);
		
		if(isFileExist("C://Downloadedfiles/info.pdf"))
		{
			System.out.println(" file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
	}

	
	static boolean isFileExist(String path)
	{
		File f=new File(path);
		
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
