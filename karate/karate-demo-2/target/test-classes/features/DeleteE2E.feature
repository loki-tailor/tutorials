Feature: delete user and verify if deleted

  ########################################################
  Background: 
    * url 'https://gorest.co.in'
    * def random_string =
      """
      	function(s) {
      		var str = "";
      		var pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      		for(var i=0; i<s; i++) 
      				str += pattern.charAt(Math.floor(Math.random() * pattern.length()));
      	return str;
      	}
      """
    ########################################################
    * def randomEmailStr = random_string(10);
    * print randomEmailStr
    ########################################################
    * def reqPayLoad =
      """
      	{
      			"name": "tomab",
      			"gender": "male",
      			"status": "active"
      	}
      """
    * set reqPayLoad.email = randomEmailStr + "@gmail.com"
    * print reqPayLoad

  ########################################################
  Scenario: create a user with the given data
    Given path '/public/v1/users'
    And request reqPayLoad
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.name == 'tomab'
    And match $.data.email == reqPayLoad.email
    ########################################################
    # fetch the user id from the POST call response
    * def userId = $.data.id
    * print userId
    ########################################################
    # DELETE the above created user
    Given path '/public/v1/users/' + userId
    And header Authorization = 'Bearer ' + tokenID
    When method DELETE
    Then status 204
    ########################################################
    # GET same user to verify it is deleted
    Given path '/public/v1/users/' + userId
    And header Authorization = 'Bearer ' + tokenID
    When method GET
    Then status 404
    And match $.data.message == 'Resource not found'
########################################################
