Feature: User Registration Test

  Scenario Outline: Successful registration with valid credentials
    Given I am on the registration page
    When I enter valid first name <firstName>
    And I enter valid lastName <lastName>
    And I enter valid email <email>
    And I enter valid password <password>
    And I enter valid confirm password <confirmPassword>
    And I select valid group <group>
    And I click the create account button
    Then User must get notification : Waiting for admin approval

    Examples:
      | firstName | lastName   | email | password | confirmPassword | group |
      | moa       | m@12345678 | m@    | mma      | dmfdn           | 1     |