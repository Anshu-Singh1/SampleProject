package reqres;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class WayToCreatePostRequestBody {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
      //create user
	Object id = given().contentType("application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
	.when().post("/api/users").jsonPath().get("id");
	System.out.println(id);
	
	//get user
//	given()
//	.when().get("/api/users/"+id).then().statusCode(200).log().all();
	
	//update user
	given().contentType("application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}")
	.when().put("/api/users/"+id).then().statusCode(200).log().all();
	
	//delete
	given().contentType("application/json")
	.when().delete("/api/users/"+id).then().statusCode(204).log().all();
	} 
}
