#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login

  Scenario: Successful Login with valid Credintial
    Given User launch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And click on Login
    Then page Title should be "Dashboard / nopCommerce administration"
    When user click on log out
    Then Page Title should be "Your store. Login"
    And close browser

  Scenario Outline: Successful Login with valid Credintial outline
    Given User launch chrome browser
    When User open URL <url>
    And click on Login
    Then page Title should be "Dashboard / nopCommerce administration"
    When user click on log out
    Then Page Title should be "Your store. Login"
    And close browser

    Examples: 
      | url                                      |
      | https://admin-demo.nopcommerce.com/login |
