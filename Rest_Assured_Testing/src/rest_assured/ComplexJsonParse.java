package rest_assured;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js= new JsonPath(payload.CoursePrice());
		
		//get number of courses
		int countsize = js.getInt("courses.size()");
		System.out.println(countsize);
		System.out.println("-----------------------------------------------");
		
		//print purchaseAmount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		System.out.println("-----------------------------------------------");
		
		//print title of the first course
		String title1 = js.getString("courses[0].title");
		System.out.println(title1);
		System.out.println("-----------------------------------------------");
		
		//Print all courses and respective prices 
		for (int i=0; i<countsize; i++)
		{
			String AllCT = js.getString("courses["+i+"].title");
			int AllCP = js.getInt("courses["+i+"].price");
			System.out.println(AllCT+"-"+ AllCP);
			
		}
		
		System.out.println("-----------------------------------------------");
		
		//print number of copies for RPA
		for (int i=0; i<countsize; i++)
		{
			String AllCT = js.getString("courses["+i+"].title");
			if(AllCT.equalsIgnoreCase("RPA")) 
			{
				int NrCopie = js.getInt("courses["+i+"].copies");
				System.out.println("Number of copies for RPA are: " + NrCopie);
				break;
			}
			
			
			
		}
		System.out.println("-----------------------------------------------");
		
	}

}
