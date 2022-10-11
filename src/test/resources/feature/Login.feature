Feature: Login
  @Login
  Scenario Outline: I want to login with correct details
    Given I am on<https://www.saucedemo.com/> website
    And I have entered<username> and <password>
    When I click on the login button
    Then I should be login successfully
    Examples:
    |username                |password|
    |standard_user           |secret_sauce|
    |locked_out_user         |secret_sauce|
    |problem_user            |secret_sauce|
    |performance_glitch_user |secret_sauce|