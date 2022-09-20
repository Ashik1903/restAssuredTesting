package stepDefinition;
import methods.*;
import io.cucumber.java.en.*;


public class restGetAPIStepDef {
	
	restGetAPIMethods restGetAPIMethods = new restGetAPIMethods();
	
	//===========================GET API IMPLEMENTATION=================================================
	
	@Given("user runs get API")
	public void user_runs_get_api() {
		System.out.println("1");
		restGetAPIMethods.rungetAPI();
	}

	@Then("user should get proper status code")
	public void user_should_get_proper_status_code() {
		System.out.println("2");
		restGetAPIMethods.getStatusCode();
	}

	@Then("user should be able to get proper response")
	public void user_should_be_able_to_get_proper_response() {
		System.out.println("3");
		restGetAPIMethods.getResponseBody();
	}
	
	@And("Validate the JSON Schema")
	public void validate_json_schema() {
		System.out.println("4");
		restGetAPIMethods.validateJSONSchema();
	}
	
	@And("Verify the body data")
	public void verify_body_data() {
		System.out.println("5");
		restGetAPIMethods.validateBodyData();
	}
	
	//==========================POST API IMPLEMENTATION=========================================================
	
	@Given("user takes input from the user to run POST API")
	public void user_takes_input_from_the_user_to_run_post_api() {
		System.out.println("6");
	}

	@When("user provides {string} and {string}")
	public void user_provides_and(String name, String job) {
		System.out.println("7");
		restGetAPIMethods.testPOSTrequest(name, job);
		
	}

	@Then("user should be able to fire post API")
	public void user_should_be_able_to_fire_post_api() {
		System.out.println("8");
	}

	@Then("user should get proper response code back")
	public void user_should_get_proper_response_code_back() {
		System.out.println("9");
	}
	
	//=========================PUT API IMPLEMENTATION=============================================
	
	@Given("user takes input from the user to run PUT API")
	public void user_takes_input_from_the_user_to_run_put_api() {
		System.out.println("10");
	}

	@When("user provides {string} and {string} for Put request")
	public void user_provides_and_for_put_request(String name, String job) {
		System.out.println("11");
		restGetAPIMethods.testPUTrequest(name, job);
	}

	@Then("user should be able to fire PUT API")
	public void user_should_be_able_to_fire_put_api() {
		System.out.println("12");
	}
	
	//======================PATCH API IMPLEMENTATION==============================================
	
	@Given("user takes input from the user to run PATCH API")
	public void user_takes_input_from_the_user_to_run_patch_api() {
		System.out.println("13");
	}

	@When("user provides {string} for PATCH request")
	public void user_provides_for_patch_request(String job) {
		System.out.println("14");
		restGetAPIMethods.testPATCHrequest(job);
	}

	@Then("user should be able to fire PATCH API")
	public void user_should_be_able_to_fire_patch_api() {
		System.out.println("15");
	}
	
	@Given("user fires the DELETE API")
	public void user_fires_the_delete_api() {
		System.out.println("16");
	}

	@Then("records should be deleted")
	public void records_should_be_deleted() {
		System.out.println("17");
		restGetAPIMethods.testDELETErequest();
	}


}
