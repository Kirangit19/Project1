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
Feature: It contains TCs related to Actitime Login page

  Scenario Outline: check actitime login functinality with <Flow> user
    Given user in on actitime login page
    When user enters username as <username> in the username field
    And user enters password as <password> in password field
    And clicks on Login button
    Then user should get page title as <title>
		And close the browser
    Examples: 
      | Flow    | username | password | title                       |
      | valid   | admin    | manager  | actiTIME - Enter Time-Track |
      | invalid | admin    | ""       | actiTIME - Login            |
      | invalid | ""       | manager  | actiTIME - Login            |
