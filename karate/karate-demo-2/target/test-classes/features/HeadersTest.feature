Feature: headers demo

  ############################################################
  Scenario: pass the user request with headers - approach 1
    Given header Content-Type = 'text/xml;charset=ISO-8859-1'
    And header Accept-Encoding = 'gzip,deflate'
    And header Connection = 'Keep-Alive'
    And header Except = '100-continue'
    And header User-Agent = 'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)'
    When url baseUrl + '/public/v1/users'
    And path '30'
    When method GET
    Then status 200
    * print response

  ############################################################
  Scenario: pass the user request with headers approach - 2
    * def req_headers = { Content-Type: 'text/xml;charset=ISO-8859-1', Accept-Encoding: 'gzip,deflate', Connection: 'Keep-Alive', Except: '100-continue', User-Agent: 'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)' }
    Given headers req_headers
    When url baseUrl + '/public/v1/users'
    And path '30'
    When method GET
    Then status 200
    * print response

  ############################################################
  Scenario: pass the user request with headers approach - 3
    * configure headers = { Content-Type: 'text/xml;charset=ISO-8859-1', Accept-Encoding: 'gzip,deflate', Connection: 'Keep-Alive', Except: '100-continue', User-Agent: 'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)' }
    When url baseUrl + '/public/v1/users'
    And path '30'
    When method GET
    Then status 200
    * print response
############################################################
