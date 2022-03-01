Feature: create user using a POST api

  ########################################################################
  Background: 
    * url 'https://gorest.co.in'
    ########################################################################
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
    * def randomStr = random_string(10);
    * print randomStr
    ########################################################################
    * def reqPayLoad = read('../../resources/payload/user.json')
    * set reqPayLoad.email = randomStr + "@gmail.com"

  #* def reqPayLoad = read('classpath:src/test/resources/payload/user.json')
  ########################################################################
  Scenario: create a user with the given data
    Given path '/public/v1/users'
    And request reqPayLoad
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == 'tomab'
    And match $.data.email == reqPayLoad.email
########################################################################
