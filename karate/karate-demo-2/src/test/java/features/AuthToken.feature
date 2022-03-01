Feature: token passing in headers

  ##########################################################################################
  Scenario: passing queryParams as jsonObj
  	* def queryParams = { status: 'active', gender: 'male', id: 2457 }
  	Given header Authorization = 'Bearer ' + tokenID
    And url baseUrl + '/public/v1/users' 
    And params queryParams
    When method GET
    Then status 200
    * print response
    ##########################################################################################