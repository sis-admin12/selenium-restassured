package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:\\Users\\Serghei.Matura\\eclipse-workspace\\SeleniumAutomation\\src\\selenium/WebTable.html");//deja nu-i
		Thread.sleep(3000);
		//int rows=driver.findElements(By.tagName("tr")).size();
		
		int rows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println(rows);
				
		int columns=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
		System.out.println(columns);
		
		System.out.println("Product"+"    "+"Article"+"    "+"Price");
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				
				String value=driver.findElement(By.xpath("/html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"    ");
				
			}
			System.out.println();
		}
		
	}
}
