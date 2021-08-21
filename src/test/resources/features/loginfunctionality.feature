@smoke
Feature:As a user, I should be able to login in bookit login page
  Background:
    Given user is on login page
  @B204-370 @B204-372
  Scenario Outline: verify that the user can log in with valid credentials as(Teacher, team-lead and student )
    Given user enter "<username>" and "<password>"
    When user clicks on sign in button
    Then user should see header that says "map"
    Examples:
      | username                       | password        |
      | teachervawiltonamiss@gmail.com | wiltonamiss     |
      | mcossor8l@webmd.com | cecilnacey     |
      | nyablsley8g@nasa.gov| huntdurand    |