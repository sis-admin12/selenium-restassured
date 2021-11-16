package selenium;

import org.openqa.selenium.By;                
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFileOrange {

	public static void main(String args[]) throws InterruptedException, FindFailed
		{
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		WebElement PIM=driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b"));
		WebElement Employeelist=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		
		WebElement addEployee=driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(PIM).moveToElement(Employeelist).moveToElement(addEployee).click().build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\'photofile\']")).click();
				
		String imagesFilepath="C:\\Users\\Serghei.Matura\\eclipse-workspace\\Sikuli_foto\\";
		String inputFilepath="C:\\Users\\Serghei.Matura\\eclipse-workspace\\Sikuli_foto\\";
		
		Screen s=new Screen();
		
		Pattern fileInputTextBox=new Pattern(imagesFilepath + "Filename.PNG");
		Pattern openButton=new Pattern(imagesFilepath + "open.PNG");
		
			
		s.wait(fileInputTextBox,10);
		s.type(fileInputTextBox,inputFilepath +"20689365");
		s.click(openButton);
			
		

	}

}
