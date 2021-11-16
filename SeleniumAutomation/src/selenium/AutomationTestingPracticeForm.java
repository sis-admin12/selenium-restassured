package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPracticeForm {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.get("https://testautomationpractice.blogspot.com/");
	    
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    
	    driver.switchTo().frame(0);//Switch to frame
	   
	   driver.manage().window().maximize();
	    
	    //sing up, write your dates
	    driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']")).sendKeys("Oliver");//Enter FirstName
	    driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']")).sendKeys("Twist");//Enter LName
	    driver.findElement(By.id("RESULT_TextField-3")).sendKeys("12345678");//Enter Phone Number
	    driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Canada");//Enter Country
	    driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Toronto");//Enter City
	    driver.findElement(By.id("RESULT_TextField-6")).sendKeys("Oliver@gmail.com");//Enter Email
	    
	    //select best time
	    Select Options = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));//Select dropdown	   
	    List <WebElement> list = Options.getOptions();//Print all options
	    	for(WebElement e:list) {
	    		System.out.println(e.getText());		   
	    	}
	    System.out.println(Options.getOptions().size());// Get the number of options of dropdown
	    Options.selectByVisibleText("Morning"); // Select an option 
	    
	    //select gender
   	    driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label")).click();//Select Gender(male) Radio button  
   	    //select days of week
	    driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).click();//Select Check box - monday
	    driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label")).click();// Select another Check box - friday
	   //return to the main page
	    driver.switchTo().defaultContent(); //Here You have to come out of first frame to continue rest of the elements
	     
	    	//Alert		
	  		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
	  		driver.switchTo().alert().accept(); //close alert by using OK button
	  		//driver.switchTo().alert().dismiss(); //close alert by using cancel button
	  		WebElement alert1=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
	  		System.out.println(alert1.getText());//You pressed OK
	    
	  		//Select menu ---> select a speed
	  		Select Options1 = new Select(driver.findElement(By.id("speed")));//Select dropdown	speed   
		    List <WebElement> list1 = Options1.getOptions();//Print all options
		    	for(WebElement i:list1) {
		    		System.out.println(i.getText());		   
		    	}
		    System.out.println(Options1.getOptions().size());// Get the number of options of dropdown
		    Options1.selectByVisibleText("Fast");
		    

					
			driver.findElement(By.xpath("//*[@id=\"files\"]")).click(); //click on Combo => Select a file
			driver.findElement(By.xpath("//*[@id=\"files\"]/option[3]")).click(); //click on option 'Doc file'
			
			driver.findElement(By.xpath("//*[@id=\"number\"]")).click();//Click on combo => Select a number
			driver.findElement(By.xpath("//*[@id=\"number\"]/option[5]")).click(); //click on option 5
		    
			driver.findElement(By.xpath("//*[@id=\"products\"]")).click(); //Select a Product
			driver.findElement(By.xpath("//*[@id=\"products\"]/option[4]")).click(); //Bing
			
			driver.findElement(By.xpath("//*[@id=\"animals\"]")).click(); //Select an Animal
			driver.findElement(By.xpath("//*[@id=\"animals\"]/option[4]")).click(); //Avatar
	    
			//Date Picker - Current Date
			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.linkText("9")).click();
			
			//ToolTip Capture			
			String tooltip1=driver.findElement(By.xpath("//*[@id=\"HTML8\"]/div[1]/p[1]/a")).getAttribute("title");//Tooltips
			System.out.println(tooltip1);
			
			String tooltip2=driver.findElement(By.xpath("//*[@id=\"HTML8\"]/div[1]/p[2]/a")).getAttribute("title");//ThemeRoller 
			System.out.println(tooltip2);
			
			
			//New Window wikipedia
			driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("udp");
			driver.findElement(By.className("wikipedia-search-button")).click();			
			List <WebElement>search_results=driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));					
			System.out.println(search_results.size());			
			/*for(WebElement s:search_results)
			{
			String link=s.getText();
			driver.findElement(By.linkText(link)).click();
			}*/
			
			 //Drag and Drop				
			WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			
			Actions act=new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
			
			 //Drag and Drop Image				
			WebElement sourceI=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
			WebElement sourceI2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
			WebElement targetI=driver.findElement(By.xpath("//*[@id=\"trash\"]"));					
			act.dragAndDrop(sourceI, targetI).build().perform();
			act.dragAndDrop(sourceI2, targetI).build().perform();
			
																  	
		//HTML Table		
		int rows=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		
		System.out.println("BookName"+"       "+"Author"+"       "+"Subject"+"      "+"Price"); //Header
		System.out.println("------------------------------------------------------"); //Header
		
		for(int r=2;r<=rows;r++)
		{
			String bookname=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[1]")).getText(); //Book Name
			String author=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[2]")).getText(); //Book Name
			String subject=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText(); //Book Name
			String price=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[4]")).getText(); //Book Price
			System.out.println(bookname+"     "+author+"        "+subject+"      "+price);
		}
		//modulele de mai jos au gliucuri
		//Slider
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(5000);
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		
		
		//Resizable			
		WebElement resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Thread.sleep(5000);
		act.moveToElement(resizable).dragAndDropBy(resizable, 150, 200).build().perform();

	

	

	}
	
}
