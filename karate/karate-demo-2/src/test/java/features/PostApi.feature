Feature: create user using a POST api

  Background: 
    * url 'https://gorest.co.in'
    * def reqPayLoad =
      """
      	{
      			"name": "tomab",
      			"email": "tomab@gmail.com",
      			"gender": "male",
      			"status": "active"
      	}
      """

  Scenario: create a user with the given data
    Given path '/public/v1/users'
    And request reqPayLoad
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == 'tomab'
    And match $.data.email == 'tomab@gmail.com'
