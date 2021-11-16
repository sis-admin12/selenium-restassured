package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.manage().window().maximize();
		
		//login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		//Admin-->Usermanagement-->Users
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		//Table
		
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(rows);
		
		int count=0;
		int count1=0;
		
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++; //1 2 3........
			}
			else
			{
				count1++;
			
			}
			
		}
		
		System.out.println("Number of enabled employees:"+ count);
		System.out.println("Number of not enabled employees:"+ count1);
		//System.out.println("Number of disabled employees:"+ (rows-count));
		
		driver.quit();
	}

}










