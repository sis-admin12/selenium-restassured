package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait se scrie doar odata si doar aici la incepul dupa crearea obiectului driver
		
		driver.get("https://goo.gl/RVdKM9");
		//driver.manage().window().maximize();//maximizeaza fereastra
		
		String titlu=driver.getTitle();//returneaza titlul paginei
		System.out.println("Titlu paginei este - "+titlu);
		
		String url=driver.getCurrentUrl();//returneaza url la pagina
		System.out.println("Url a paginei este - "+url);
		
		//System.out.println(driver.getPageSource());//returneaza HTML codul paginei
		
		//first name
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Jorj");
		//last name
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Haiamba");
		//phone
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("258731964");
		//Country
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("USAAAA");
		//City
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Miami");
		//email
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("haiambaj@gmail.co");
		//buton cu selectare
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		Select drop= new Select(sel);//am facut web elementul in obiect
		//verifica cite optiuni are
		System.out.println("Numarul de optiuni este:"+drop.getOptions().size());
		//extragerea si printarea tuturor optiunilor
		List <WebElement> options=drop.getOptions();
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		//select option
		drop.selectByVisibleText("Morning");
		drop.selectByIndex(3);
		drop.selectByValue("Radio-1");
		
		
		//lucru cu botoane cu punere de galocica
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td"));
		System.out.println(radio.isDisplayed());//verifica daca este butonul - true
		System.out.println(radio.isEnabled());//verifica daca este activ sau nu - true
		System.out.println("Inainte de selectare "+radio.isSelected());//verifica daca este selectat - false
		radio.click();//selecteaza butonul
		Thread.sleep(1000);
		System.out.println("Dupa selectare "+radio.isSelected());//true
		
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();
		Thread.sleep(3000);
		//links
		driver.findElement(By.linkText("Software Testing Tools Training")).click();
		Thread.sleep(3000);
		driver.navigate().back();//se intoarce inapoi
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
