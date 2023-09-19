package reqres;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
;
public class ShopperStack {
public static void main(String[] args) {
	RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	Object shopperId = given().contentType("application/json").body("{\r\n"
			+ "  \"email\": \"anshusinghfire007@gmail.com\",\r\n"
			+ "  \"password\": \"@Mummy123\",\r\n"
			+ "  \"role\": \"SHOPPER\"\r\n"
			+ "}")
			.when().post("/users/login").jsonPath().get("data.userId");
			System.out.println(shopperId);
			
	Object token = given().contentType("application/json").body("{\r\n"
					+ "  \"email\": \"anshusinghfire007@gmail.com\",\r\n"
					+ "  \"password\": \"@Mummy123\",\r\n"
					+ "  \"role\": \"SHOPPER\"\r\n"
					+ "}")
					.when().post("/users/login").jsonPath().get("data.jwtToken");
	System.out.println(token);
	
	//view product
	
	
}
}
