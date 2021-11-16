package SelectDate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		String month="March, 2022";
		String day="25";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();// click butonul hotels
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();// click butonul check in
		
		
		Thread.sleep(2000);
		
		while(true)
		{
			String text=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/nav[1]/div[2]")).getText();
			                           //*[@id="datepickers-container"]/div[1]/nav/div[2]/i
			                                        
			System.out.println(text);
			
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/nav[1]/div[3]")).click();
				                            
			}
		}
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[contains(text(),"+day+")]")).click();
		                              
		
		
	}

}
