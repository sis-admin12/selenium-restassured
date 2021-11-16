package rest_assured;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

public class JiraAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RestAssured.baseURI="http://localhost:8080";
		
		
		//Login scenario
		SessionFilter sesion = new SessionFilter();
		String response = given().header("Content-Type", "application/json").body("{ \"username\": \"sergiu_2000\", \"password\": \"extrim21!\" }")
		.when().filter(sesion).post("/rest/auth/1/session").then().log().all().extract().response().asString();
		
		System.out.println(response);
		String expectedMessage = "Hi how are you?";
		
		
		//Add comment 
		String AddCommentResponse = given().pathParam("id", "10005").header("Content-Type", "application/json").body("{\r\n"
				+ "    \"body\": \""+expectedMessage+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(sesion).when().post("/rest/api/2/issue/{id}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js = new JsonPath(AddCommentResponse);
		String CommentID = js.getString("id");
		
		//Add Attachement
		
		given().header("X-Atlassian-Token", "no-check").filter(sesion).pathParam("id", "10005")
		.queryParam("fields", "comment")
		.header("Content-Type", "multipart/form-data")
		.multiPart("file", new File("jira.txt")).when().post("rest/api/2/issue/{id}/attachments")//fara a folosi File nu va intelegee ca e fail ci il va folosi ca un parametru doar
		.then().log().all().assertThat().statusCode(200);
		
		
		//Get issue
		String IssueDetails = given().filter(sesion).pathParam("id", "10005").log().all()
		.when().get("rest/api/2/issue/{id}")
		.then().log().all().extract().response().asString();
		
		//System.out.println(IssueDetails);
		JsonPath js1 = new JsonPath(IssueDetails);
		int comentscount = js1.getInt("fields.comment.comments.size()");
		
		for(int i=0; i<comentscount; i++)

		{

		String commentIdIssue =js1.get("fields.comment.comments["+i+"].id").toString();

		if (commentIdIssue.equalsIgnoreCase(CommentID))

		{

		String message= js1.get("fields.comment.comments["+i+"].body").toString();

		System.out.println(message);

		Assert.assertEquals(message, expectedMessage);

		}
		
		
		
		
		
		//Get Issue

		}
	}

}
