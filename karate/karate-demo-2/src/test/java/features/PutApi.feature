Feature: update user details using PUT APi

  Background: 
    * url 'https://gorest.co.in'
    * def reqPayLoad =
      """
      	{
      			"status": "inactive",
      			"email": "karateabc123@gmail.com"
      	}
      """

  Scenario: update a user with the given data
    Given path '/public/v1/users/102'
    And request reqPayLoad
    And header Authorization = 'Bearer ' + tokenID
    When method PUT
    Then status 200
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.name == 'Gati Chopra V'
    And match $.data.email == 'karateabc123@gmail.com'
    And match $.data.status == "inactive"
