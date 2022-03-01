Feature: karate-config.js consumption demo

  Background: 
    * url baseUrl
    * header Accept = 'application/json'

  Scenario: CONFIG demo 1
    Given print name

  # GET with background (relying on background for url)
  Scenario: CONFIG demo 2
    Given path '/users?page=2'
    When method GET
    Then status 200
    And print response
