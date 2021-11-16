package authentification_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auth_popups {

	public static void main(String[] args) {
		
		
		
				System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// driver.get("http://the-internet.herokuapp.com/basic_auth"); //Popup

				// Approach1
				// Syntax: http://username:password@test.com
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

				String text = driver.findElement(By.cssSelector("p")).getText();
				System.out.println(text);
				
				if(text.contains("Congratulations!"))
						{
							System.out.println("IHAAAAAAAAAAAAAA");
						}
				else
				{
					System.out.println("Nu o mers!");
				}
				
				driver.close();
	}

		
	

}
