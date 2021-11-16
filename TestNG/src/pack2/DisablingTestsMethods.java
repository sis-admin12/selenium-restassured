package pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisablingTestsMethods {

	@Test(priority=1)
	void openURL(){
		System.out.println("URL opened");
		 Assert.assertTrue(true);
		
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login test");
		 Assert.assertTrue(true);
	}
	
	@Test(priority=3,enabled=false)
	void search()
	{
		System.out.println("still in progress............");
		
	}
	
	@Test(priority=4,enabled=false)
	void advancedsearch()
	{
		System.out.println("still in progress..............");
		
	}
	
	@Test(priority=5)
	void logout()
	{
		System.out.println("loogout test");
		 Assert.assertTrue(true);
	}
}
