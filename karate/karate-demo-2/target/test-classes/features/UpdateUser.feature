Feature: create user using a POST api and then update using PUT api

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
    # fetch the user id from the p ost call response
    * def userId = $.data.id
    * print userId
    ########################################################
    # put call -- to update the user
    * def reqPayLoadPut =
      """
      	{
      			"gender": "female",
      			"status": "inactive"
      	}
      """
    ########################################################
    Given path '/public/v1/users/' + userId
    And request reqPayLoadPut
    And header Authorization = 'Bearer ' + tokenID
    When method PUT
    Then status 200
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.id == userId
    And match $.data.name == 'tomab'
    And match $.data.email == reqPayLoad.email
    And match $.data.status == "inactive"
########################################################
