Feature: TEST GET API

Scenario: Testing the get API
  Given user runs get API
  Then user should get proper status code
  And user should be able to get proper response
  And Validate the JSON Schema
  And Verify the body data
  
Scenario: Testing the POST API
	Given user takes input from the user to run POST API
	When user provides <name> and <job>
	Then user should be able to fire post API
	And user should get proper response code back 

	Examples: 
      | name  	| job 		|
      | "Ashik" | "Coder" |
      | "Anjali"|	"Leader"|
      
Scenario: Testing the PUT API      
	Given user takes input from the user to run PUT API
	When user provides <name> and <job> for Put request
	Then user should be able to fire PUT API
	And user should get proper response code back 

	Examples: 
      | name  	| job 		|
      | "Ashik" | "Acter" |
      
Scenario: Testing the PATCH API
	Given user takes input from the user to run PATCH API
	When user provides <job> for PATCH request
	Then user should be able to fire PATCH API
	And user should get proper response code back 
	
	Examples:
			|	job		|
			|"lover"|
			
Scenario:	Testing the DELETE API
	Given user fires the DELETE API
	Then records should be deleted
	
	
	
	
	## pending tasks on this framework :
# 1. add the csv file reader
# 2. RAML, Message Schema
# 3. jenkins/git implementation
# 4. revise java for the interview
# 5. Apply for the job role tomorrow	