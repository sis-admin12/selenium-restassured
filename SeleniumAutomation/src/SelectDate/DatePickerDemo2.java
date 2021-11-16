package SelectDate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com/");
	
		driver.findElement(By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		
		String month="March 2022";
		String exp_date="25";
				
			
		while(true)
		{
			String text=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")).getText();
			
			System.out.println(text);
			
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/*[1]")).click();
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\\'frm\\']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr/td/span/span[contains(text(),"+exp_date+")]")).click();
		
		/*List <WebElement> allDates=driver.findElements(By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr/td/span/span"));
		
		for(WebElement ele:allDates)
		{
			String date_text=ele.getText();
		
			
			String date[]=date_text.split("\n");
			System.out.println(date_text);
			
			if(date[1].equals(exp_date))
			{
				
				ele.click();
				break;
			}
			
		}*/
	
	}
	
}
