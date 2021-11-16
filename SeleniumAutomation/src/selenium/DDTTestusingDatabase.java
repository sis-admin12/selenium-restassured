package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTTestusingDatabase {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");//nu lucreaza deja situl
		
		//step1
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");// nu se primeste conexiunea la baza

		//step2
		Statement stmt=con.createStatement();
		
		//Step3 & step4 : Creation and executio of query
		String s="select * From users";
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next())
		{
			String uname=rs.getString("USERNAME");
			String pwd=rs.getString("PASSWD");
			
			driver.findElement(By.name("userName")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
			{
				System.out.println("passed");
			}
			else
			{
				System.out.println("failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
		}
				
		//step5
		rs.close();
		con.close();
		
	}

}
