Feature: GET api feature

  Scenario: get user details
    Given url 'https://gorest.co.in/public/v2/users'
    And path '30'
    When method GET
    Then status 200
    * print response
    * print response.name
    * match response.name == 'Lakshman Somayaji CPA'
    * match response.id == 30
    * match response.gender == 'male'

  Scenario: get user details: user not found
    Given url 'https://gorest.co.in/public/v2/users'
    And path '100'
    When method GET
    Then status 404
