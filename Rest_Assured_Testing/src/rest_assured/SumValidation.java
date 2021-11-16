package rest_assured;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	//pentru a nu scrie void satic main se foloseste anotarea @Test dupa se creaza o metoda si folosi TESTNG
	@Test
	public void SumCourses()
	{
		JsonPath js= new JsonPath(payload.CoursePrice());//JsonPath is using for parsing a json body
		int sumT=0;
		int countsize = js.getInt("courses.size()");
		for (int i=0; i<countsize; i++)
		{
			int Price = js.getInt("courses["+i+"].price");
			int Copies = js.getInt("courses["+i+"].copies");
			int sum= Price * Copies;
			System.out.println(sum);
			sumT= sumT+sum;
			
		}
		System.out.println("The total sum is: " + sumT);
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		
		Assert.assertEquals(sumT, totalAmount);
		
//		if(totalAmount==sumT) 
//		{
//			System.out.println("The Total sum is correct!");
//		}
//		else
//		{
//			System.out.println("The Total sum is incorrect!");
//		}
//		
	}

}
