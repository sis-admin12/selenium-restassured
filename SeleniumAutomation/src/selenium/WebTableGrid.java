package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableGrid {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/WebTable.html");
		//driver.manage().window().maximize();

		
		
		int rows = driver.findElements(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div")).size();
		
		System.out.println(rows);

		int cols = driver.findElements(By.xpath("/html/body/section/div/div/div")).size();
		System.out.println(cols);

		// Reading emails and FirstName columns from grid
		for (int r = 1; r <= rows; r++) {
			for (int c = 1; c <= 2; c++) // I need only 2 columns Email ,FirstName
			{
				String value = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[" + r+ "]/div/div[" + c + "]/div")).getText();
				System.out.print(value + " " + "\t"); // \t is for tab space in output
			}
			System.out.println();

		}

	}

}
