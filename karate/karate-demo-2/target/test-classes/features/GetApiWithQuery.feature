Feature: GET api with query parameters

  ##########################################################################################
  Scenario: passing queryParams as jsonObj
    * def queryParams = { status: 'active', gender: 'male', id: 2457 }
    Given url baseUrl + '/public/v1/users'
    And params queryParams
    When method GET
    Then status 200
    * print response

  ##########################################################################################
  Scenario: get all active users
    * def queryParams = { status: 'active' }
    Given url baseUrl + '/public/v1/users'
    And params queryParams
    When method GET
    Then status 200
    * print response
    * assert response.data.length == 20
    * def resLen = response.data.length
    * match  resLen == 20
    ##########################################################################################
