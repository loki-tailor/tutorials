Feature: GET Api Demo

# '$' can't be used with asserts

  Background: 
    * url 'https://reqres.in/api'
    * header Accept = 'application/json'

  # simple GET request (with query params)
  Scenario: GET demo 1
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  # simple GET request (no query params)
  Scenario: GET demo 2
    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  # GET with background (relying on background for url)
  Scenario: GET demo 3
    Given path '/users?page=2'
    When method GET
    Then status 200
    And print response

  # GET with path, params explicitly
  Scenario: GET demo 4
    Given path '/users'
    And param page = 2
    When method GET
    Then status 200
    And print response

  # GET with ASSERTIONS (basic)
  Scenario: GET demo 5
    Given path '/users'
    And param page = 2
    When method GET
    Then status 200
    And print response
    And match response.data[0].first_name != null
    And assert response.data.length == 6
    And assert response.data[3].id == 10 
    And match $.data[4].last_name == 'Edwards'
