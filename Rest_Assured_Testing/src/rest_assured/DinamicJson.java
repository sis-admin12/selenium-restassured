package rest_assured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DinamicJson {
	//add Books
	@Test(dataProvider="BooksData", priority=1)
	public void addBook(String isbn, String aisle)
	{
		RestAssured.baseURI= "http://216.10.245.166";
		String response = given()
		.header("Content-Type", "application/json")
		.body(payload.AddBook(isbn, aisle))
		.when()
		.post("Library/Addbook.php")
		.then()
		.assertThat().statusCode(200)
		.extract().response().asString();
		
		
		JsonPath js= new JsonPath(response);
		String ID=js.getString("ID");
		System.out.println("place iD is: " +ID);
		
		//daca vrem sa luam body dintrun fail extern .json trebuie dupa given in body de convertit failul in byte dupa in string
		//new String(Files.readALLBytes(Paths.get("drumul la file json"))
		// .body(GenerateStringFromResource("C:\\Users\\rahul\\Documents\\Addbookdetails.json"))
	}
	
	
	//delete Books
	

	
	
	
	@DataProvider(name="BooksData")// se foloseste ca o multime de valori pentru anumite variabile ce dorim sa le schimbam de mai multe ori
	public Object[][] getData()
	{
		return new Object[][] {{"fdsf", "34324"}, {"dfgdf", "6544"}, {"erui", "56465"}};//obiect dictionar cu valorile necesare pentru isbn si aisle
	}

}
