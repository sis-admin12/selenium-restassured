package Capture_Image;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
 
public class CaptureLogoImage 
{
    public static void main(String args[]) throws IOException
    {
    	System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); 
    	    		
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
       ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C://Users//Serghei.Matura//eclipse-workspace//images/OrangeHRMlogo.png"));
        
        File f = new File("C://Users//Serghei.Matura//eclipse-workspace//images/OrangeHRMlogo.png");   
		
		if(f.exists()) 
		{ 
		   System.out.println("Image File Captured");
		 }
		else
		{
			System.out.println("Image File NOT exist");
		}
        
        
    }
}