package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.manage().window().maximize();
				
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click(); //1 frame
		
		driver.switchTo().defaultContent(); // go back to page/focus on the page
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click(); //2 frame
		
		driver.switchTo().defaultContent(); // go back to page/focus on the page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click(); // 3rd frame
	}

}
