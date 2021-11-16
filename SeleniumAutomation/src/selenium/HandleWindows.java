package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//String handleValue=driver.getWindowHandle();
		//System.out.println(handleValue); //CDwindow-45FEE686DED3D844347AB3AC2E7F5E41
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button ")).click();
		
		Set <String> handlevalues=driver.getWindowHandles();
		
		for(String h:handlevalues)
		{
			//System.out.println(h);
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);
			
			if(title.equals("SeleniumHQ Browser Automation") )
			{
				driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[1]")).click(); //contact menu
			}
		}
	
	}

}
