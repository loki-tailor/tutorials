Feature: PUT api demo

  Scenario: PUT api demo 1
    Given url 'https://reqres.in/api/users/2'
    And request { "name": "lokeshwar1", "job": "tester2" }
    When method PUT
    Then status 200
    And print response
    And print responseStatus
