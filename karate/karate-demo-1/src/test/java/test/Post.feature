Feature: POST api demo

  ################################################################
  Background: 
    * url 'https://reqres.in/api'
    * header Accept = 'application/json'
    * def expectedOutput = read("response1.json")

  ################################################################
  # Simple POST request (without usage of background)
  Scenario: POST demo 1
    Given url 'https://reqres.in/api/users'
    And request { "name": "lokeshwar1", "job": "leader1" }
    When method POST
    Then status 201
    And print response

  ################################################################
  # Simple POST request (WITH usage of background)
  Scenario: POST demo 2
    Given path '/users'
    And request { "name": "lokeshwar1", "job": "leader1" }
    When method POST
    Then status 201
    And print response

  ################################################################
  # Simple POST with assertions
  Scenario: POST demo 3
    Given path '/users'
    And request { "name": "lokeshwar1", "job": "leader1" }
    When method POST
    Then status 201
    And print response
    And match $ == { "name": "lokeshwar1", "job": "leader1", "id": "#string", "createdAt": "#ignore" }

  ################################################################
  # Simple POST with read response from file
  Scenario: POST demo 4
    Given path '/users'
    And request { "name": "lokeshwar1", "job": "leader1" }
    When method POST
    Then status 201
    And print response
    And match $ == expectedOutput

  ################################################################
  # Simple POST with read request & response from file
  Scenario: POST demo 5
    Given path '/users'
    And def reqBody = read("request1.json")
    And request reqBody
    When method POST
    Then status 201
    And print response
    And match $ == expectedOutput

  ################################################################
  # Simple POST with read request & response from file not in same dir
  Scenario: POST demo 6
    Given path '/users'
    And def projectPath = karate.properties['user.dir']
    And print projectPath
    And def filePath = '/data/request2.json'
    And def reqBody = read(filePath)
    And print filePath
    And request reqBody
    When method POST
    Then status 201
    And print response
    And match $ == expectedOutput

  ################################################################
  # Simple POST - modify read json payload
  Scenario: POST demo 7
    Given path '/users'
    And def projectPath = karate.properties['user.dir']
    And def filePath = '/data/request2.json'
    And def reqBody = read(filePath)
    And set reqBody.job = "tester1"
    And request reqBody
    When method POST
    Then status 201
    And print response
    And match $ == expectedOutput
################################################################
