package newRestAssured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class DataDrivenExamples {

	@DataProvider(name="new data")
	public Object[][] dataForPost()
	{
	/*	Object[][] data = new Object[2][3];
		
		data[0][0] = "Dustin";
		data[0][1] = "steve";
		data[0][2] = 1;
		

		data[1][0] = "Eleven";
		data[1][1] = "mike";
		data[1][2] = 2;
		
		return data;
	*/
		
		// alternative part
		
		return new Object[][] {
			
			{"Robin", "Max", 1},
			{"lucas", "Erica", 2}	
		};
	}	
		
	
	
	@Test(dataProvider = "new data")
	public void Test_Post(String firstName, String lastName, int SubjectId)
	{
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("SubjectId", SubjectId);
		
		baseURI = "http://localhost:3000/";
		
		given()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.header("Content-Type", "application/json")
		.body(request.toJSONString()).
		
		when()
		.post("/users")
		
		.then()
		.statusCode(201)
		.log().all();
	}
	
	
//	@DataProvider(name = "DeleteData")
	public Object[] dataforDelect()
	{
		return new Object[] 
				{
						"3fd9","b6e5"
				};
	}
	
	
//    @Test(dataProvider = "DeleteData")
	
	public void test_delete(String userId)
	{
		baseURI = "http://localhost:3000/";
		
		when()
		.delete("/users/"+userId)
		
		.then()
		.statusCode(200);
	}

	// parameterzation
		
		@Parameters({"userId"})
		@Test
		public void test_delete2(String userId)
		{
			System.out.println("Value for userId is: "+userId);
			baseURI = "http://localhost:3000/";
			
			when()
			.delete("/users/"+userId)
			
			.then()
			.statusCode(200);
		
		
		
		
	
	}
	}
