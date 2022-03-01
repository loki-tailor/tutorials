Feature: print hello world feature

  Scenario: hello world scenario
    * print 'hello world'
    * print 'lokeshwar'

  Scenario: declare and print variable
    * def bal = 100
    * def fee = 20
    * def tax = 10
    * print 'total amount -> ' + (bal + fee + tax)

  Scenario: multiply
    * def a = 100
    * def b = 20
    * print 'multiplication -> ' + (a * b)
