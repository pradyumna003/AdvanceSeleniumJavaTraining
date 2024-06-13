Feature: User Login

  Scenario:User is able to login with valid credentials

    Given User enters valid user name in the user name field
    And User enter valid password in the password field
    When User clicks on the login button
    Then User is Logged in Successfully

  Scenario: User is unable to login with valid credentials
    Given User enters invalid user name in the user name field
    And User enter invalid password in the password field
    When User clicks on the login button
    Then User is  not Logged in to the application



