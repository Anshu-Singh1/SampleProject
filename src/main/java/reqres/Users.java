package reqres;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Users {
	public static void main(String[]args) {
		RestAssured.baseURI="https://reqres.in/";
		given().log().all()
		.when().get("/api/unknown")
		.then().log().all().assertThat().statusCode(200);  
		
	}
	}

