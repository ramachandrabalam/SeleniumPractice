package restAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basic_resr {
//validating the add place api
	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().
		  
		        log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		        .body("{\r\n" + 
		        		"    \"location\":{\r\n" + 
		        		"        \"lat\" : -38.383494,\r\n" + 
		        		"        \"lng\" : 33.427362\r\n" + 
		        		"    },\r\n" + 
		        		"    \"accuracy\":50,\r\n" + 
		        		"    \"name\":\"Frontline house rama240\",\r\n" + 
		        		"    \"phone_number\":\"(+91) 983 893 3937\",\r\n" + 
		        		"    \"address\" : \"29, side layout, cohen 09\",\r\n" + 
		        		"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
		        		"    \"website\" : \"http://google.com\",\r\n" + 
		        		"    \"language\" : \"French-IN\"\r\n" + 
		        		"}\r\n" + 
		        		"").when().post("maps/api/place/add/json").
		        then().log().all();
		

	}

}
