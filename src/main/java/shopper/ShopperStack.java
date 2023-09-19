package shopper;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ShopperStack {

	@Test
	void shopperLogin() {
		RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	    JSONObject body = new JSONObject();
	    body.put("email", "anshusinghfire007@gmail.com");
	    body.put("password",  "@Mummy123");
	    body.put("role", "SHOPPER");
	    
	   String loginResponse = given().contentType("application/json").body(body.toString())
	    .when().post("users/login").then().log().all()
	    .extract().response().asString();
	    System.out.println(loginResponse);
	    
//	    JsonPath js = new JsonPath(loginResponse);
//	    int shopperId = js.get("data.userId");
//	    Object token = js.get("data.jwtToken");
//	    System.out.println(shopperId);
//	    System.out.println(token);
//	    
	    
	   // @Test
	    
//	    void ViewProduct() {
//	    	given()
//	    	.when().get("products/alpha")
//	    	.then().assertThat().statusCode(200).log().all();
//	    }
//	    
	    
	    
	    
	    
}
}
