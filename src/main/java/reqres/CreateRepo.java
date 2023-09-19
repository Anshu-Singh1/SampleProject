package reqres;


import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class CreateRepo {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	given().log().all()
	.when().get("/api/users")
	.then().log().all().assertThat().statusCode(200);
	
	
	
	


}
}

