package methods;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class restGetAPIMethods {
	
	Response response;
	
	
	public void rungetAPI() {
		response = get("https://reqres.in/api/users?page=2");
	}
	
	public void getStatusCode() {
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getContentType());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));
	}
	
	public void getResponseBody() {
		System.out.println(response.getBody().asString());	
	}
	
	public void validateJSONSchema() {
		baseURI = "https://reqres.in/api/";
		
		get("users?page=2").
		then().
			assertThat().
			body(matchesJsonSchemaInClasspath("schema.json")).
			statusCode(200);
	}
	
	public void validateBodyData() {
		baseURI = "https://reqres.in/api/";
		
		given().
			get("users?page=2").
		then().
			statusCode(200).
		and().
			body("page", equalTo(2)).
			body("data[1].id", equalTo(8)).
			body("data[1].email", equalTo("lindsay.ferguson@reqres.in")).
			body("data[1].first_name", equalTo("Lindsay")).
			body("data[1].last_name", equalTo("Ferguson")).
			body("data[1].avatar", equalTo("https://reqres.in/img/faces/8-image.jpg")).
			body("data.first_name", hasItems("George","Rachel"));
	}
	
	public void testPOSTrequest(String name, String job) {
		baseURI = "https://reqres.in/api/";
		JSONObject res = new JSONObject();
		res.put("name", name);
		res.put("job", job);
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(res.toJSONString()).	
		when().
			post("/users/2").
		then().
			statusCode(201).log().all();
	}
	
	public void testPUTrequest(String name, String Job) {
		baseURI = "https://reqres.in/api/";
		JSONObject res = new JSONObject();
		res.put("name", name);
		res.put("job", Job);
		
		given().
			header("COntent-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(res.toJSONString()).	
		when().
			put("/users/2").
		then().
			statusCode(200).log().all();
	}
	
	public void testPATCHrequest(String job) {
		baseURI = "https://reqres.in/api/";
		JSONObject res = new JSONObject();
		res.put("job", job);
		
		given().
			header("COntent-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(res.toJSONString()).	
		when().
			patch("/users/2").
		then().
			statusCode(200).log().all();
	}
	
	public void testDELETErequest() {
		baseURI = "https://reqres.in/api/";
		when().
			delete("/users/2").
		then().
			statusCode(204).log().all();
	}

}
