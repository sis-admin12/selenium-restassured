package rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;

public class Basic {

	public static void main(String[] args) {

//given -- all input details
//when -- submit the API
//then -- validate the response
		
		//Add place -> Update Address with new place -> get place to Verify that address are update
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload.AddPlace())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200) //verifica status codul
		.body("scope", equalTo("APP")) //verifica daca body este egal cu APP
		.header("Server", "Apache/2.4.18 (Ubuntu)") //verifica daca Serverul este Apache
		.extract().response().asString();//extrage 
		
		System.out.println(response);//afiseaza rapunsul in Json format
		
		JsonPath js= new JsonPath(response);//face parsing in Json pentru a extrage ce ne trebuie
		String PlaceID=js.getString("place_id");
		System.out.println("place iD is: " +PlaceID);
		
		
		//update place
		
		String NewAddres = "Chisinau, bd Moscova 2";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+PlaceID+"\",\r\n"      //se poate cancatina cu o variabila scriind "+var+"
				+ "\"address\":\""+NewAddres+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")//pentru diferite metode ca put post delete se folosesc diferite silci maps/api/place/XXX/json
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		//get place   //la get nu se scriu header - nus
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", PlaceID)
		.when().get("maps/api/place/get/json")//pentru diferite metode ca put post delete se folosesc diferite silci maps/api/place/XXX/json
		.then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		
		JsonPath jsr= new JsonPath(getResponse);//face parsing in Json pentru a extrage ce ne trebuie
		String ExtractAddress=jsr.getString("address");
		
		System.out.println("new address is: " +NewAddres);
		System.out.println("extracted address is: " +ExtractAddress);
		Assert.assertEquals(ExtractAddress, NewAddres);
	}

}
