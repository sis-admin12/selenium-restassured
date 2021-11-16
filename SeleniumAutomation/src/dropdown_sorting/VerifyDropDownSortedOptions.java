package dropdown_sorting;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("animals"));
		
		Select se = new Select(element);
				
		ArrayList <String> originalList = new ArrayList <String>();
		ArrayList <String> tempList = new ArrayList <String>();
		
		for (WebElement e : se.getOptions()) 
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}

		System.out.println("this is originalList before Sorting"+ originalList);
		System.out.println("this is tempList before Sorting"+ tempList);
		
		Collections.sort(tempList);
		
		System.out.println("this is originalList after Sorting"+ originalList);
		System.out.println("this is tempList after Sorting"+ tempList);
				
		if(originalList==tempList)
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown Not sorted");
			
		}
		driver.close();
	}

}
