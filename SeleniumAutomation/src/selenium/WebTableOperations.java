package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableOperations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		// loading URL
		driver.get("file:///C:/SeleniumPractice/WebTable.html");
		
		// Printing table header of a web table assuming first row as header
		System.out.println("Printing all header of table assuming first row as header: ");
		List<WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Headers in table are below:");
		System.out.println("Total headers found: "+allHeadersOfTable.size());
		for(WebElement header:allHeadersOfTable)
		{
			System.out.println(header.getText());
		}
		System.out.println("=====================================================================");
		
		// Finding number of rows in a web table. We need to exclude header to get actual number of data rows
		System.out.println("Retrieving total number of data rows:");
		List<WebElement> allRows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Total data rows found in table:"+ (allRows.size()-1));
		System.out.println("=====================================================================");
		
		// Find number of columns in each row
		System.out.println("Retrieving total number of columns for each row:");
		for(int i=2;i<=allRows.size();i++)
		{
			List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
			System.out.println("Number of columns in "+(i-1)+" data row is:"+allColumnsInRow.size());
		}
		System.out.println("=====================================================================");
		
		//Print each rows and columns from web table
		System.out.println("Printing all column value: ");
		for(int i=2;i<=allRows.size();i++)
		{
			List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
			for(int j=0;j<allColumnsInRow.size();j++)
			{
				System.out.print(allColumnsInRow.get(j).getText()+" ");
			}
			System.out.println();
		}
		System.out.println("=====================================================================");
		
		// List books name whose author is mukesh
		System.out.println("Way 1: Books written by Mukesh are below:");
		for(int i=2;i<=allRows.size();i++)
		{
			WebElement authorColumn=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]"));
			if(authorColumn.getText().toLowerCase().equalsIgnoreCase("Mukesh"))
			{
				WebElement bookNameColumns=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
				System.out.println(bookNameColumns.getText());
			}
		}
		System.out.println("=====================================================================");
		// Another shortcut way
		System.out.println("Way 2: Books written by Mukesh are below:");
		List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[text()='Mukesh']/../td[1]"));
		for(WebElement e: allColumnsInRow)
		{
			System.out.println(e.getText());
		}
		
		// Print book name whose price is greater than and equal to 1000
		System.out.println("========================================================================");
		System.out.println("Books with price greater than and equal to 1000 are below:");
		for(int i=2;i<=allRows.size();i++) { 
			WebElement priceColumn=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[4]")); 
			if(Integer.parseInt(priceColumn.getText())>=1000)
			{
				WebElement bookName=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
				System.out.println(bookName.getText());
			}
		}
		System.out.println("========================================================================");
		
		// How to print data from last row
		System.out.println("Directly printing column values of last row of table: ");
		List<WebElement> columnOfLastRow= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[last()]/td"));
		for(WebElement e:columnOfLastRow)
		{
			System.out.println(e.getText());
		}
		System.out.println("========================================================================");
		// find sum of cost of all books listed
		
		List<WebElement> costColumns= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
		int sum_price=0;
		for(WebElement e:costColumns)
		{
			sum_price= sum_price+Integer.parseInt(e.getText());
		}
		System.out.println("total price: "+sum_price);
		System.out.println("========================================================================");
		
		
		// Retrive cell value by providing row and column number
		WebElement colValue= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]"));
		System.out.println("Cell Value : "+colValue.getText());
				
		
		// Printing column index based on column name
		List<WebElement> allHeadersOfTable2= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		for(int k=0;k<allHeadersOfTable2.size();k++)
		{
			if(allHeadersOfTable2.get(k).getText().equalsIgnoreCase("price"))
			{
				System.out.println("Column index of Price column is: "+(k+1));
			}
				
		}
		
		driver.quit();
		
	}

}
