package reqres;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class User {
public static void main(String[]args) {
	RestAssured.baseURI="https://reqres.in/";
	given().log().all()
	.when().get("/api/users/2")
	.then().log().all().assertThat().statusCode(200);  
	
}
}
