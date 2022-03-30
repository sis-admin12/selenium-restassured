package TestforU;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TestBtn {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users//Serghei.Matura//Driver//driver_mozila/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://urchinsys.com/");
	
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit .SECONDS);
    
    
    
    
  // String service = driver.findElement(By.cssSelector("h5[class='edgtf-iwt-title'][css='1']")).getText();   
   //System.out.println(service);
    //nu coincid linkurile
    String urlsevices = driver.getCurrentUrl();
    System.out.println("Linkul actual este: "+urlsevices);
    Assert.assertEquals("https://urchinsys.com/" , urlsevices);
	
    //face click pe buton linkedin
    WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div[2]/footer/div[2]/div/div/div[2]/a[2]"));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].click()", search);
	
    
    
    Set <String> handlevalues=driver.getWindowHandles();
	
	for(String h:handlevalues)
	{
		
		String title=driver.switchTo().window(h).getTitle();
		System.out.println(title);
	}
	
	driver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[2]/div[1]/div/a[1]")).click();
	
	   List<WebElement> elements = driver.findElements(By.cssSelector("base-card__full-link"));
	   System.out.println("Number of elements:" +elements.size());
	  
	   for (WebElement element : elements) {
		    System.out.println("Paragraph text:" + element.getText());
		}
    
    
    //inchide driverul
    driver.close();
    driver.quit();
    
    
    
    
    
    
    
    
	}
}
