package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;


public class Log4jdemo {
	
	static Logger logger;
	
	@Test(priority=1)
	public void setup()
	{
		
	logger=Logger.getLogger("Log4jdemo");  // Provide test a name/class name as a parameter
	PropertyConfigurator.configure("log4j.properties");
	
	//Add configuration steps
	System.out.println("This is setup method");
	
	logger.info("Setup method is started");
	logger.info("Setup method is progress");
	
	
	}

	@Test(priority=2)
	public void login()
	{
		//Write webdriver code
		System.out.println(" This is login test");
				
		logger.info("login is started");
		logger.info("login is progress");
		logger.info("login is completed");
		logger.info("login is passed");
		
	}
	
	@Test(priority=3)
	public void logout()
	{
		//Write webdriver code
		System.out.println(" This is logout test");
		
		logger.info("logout is completed");
		
		
	}
	
}
