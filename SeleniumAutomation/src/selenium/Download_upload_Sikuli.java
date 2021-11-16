package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Download_upload_Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "C://Users//Serghei.Matura//Driver//driver_mozila/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\'imagesrc\']")).click();
	    
	    String imagesfilepath = "C:\\Users\\Serghei.Matura\\eclipse-workspace\\Sikuli_foto\\";
	    String inputfilepath = "C:\\Users\\Serghei.Matura\\eclipse-workspace\\Sikuli_foto\\";
	    
	    Screen s= new Screen();
	    
	    Pattern fileinputtextbox = new Pattern(imagesfilepath+"Filename.PNG");
	    Pattern openbutton = new Pattern(imagesfilepath+"open.PNG");
	    
	    Thread.sleep(5000);
	    
	    s.wait(fileinputtextbox, 20);
	    s.type(fileinputtextbox, inputfilepath + "20689365");
	    s.click(openbutton);
	    
	    
	    
	}

}
