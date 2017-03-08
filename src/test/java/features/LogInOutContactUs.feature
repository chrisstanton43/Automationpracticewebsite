

Feature: Login Logout an Contact us feature

  Scenario: Sign in and Sign out
    Given I am on automationpractice website
    When I click on sign in link
    And I enter the email address and password
    Then I click on sign in link
    And I sign out

  Scenario: Contact Us Action
    When I open automationpractice website
    Then I perform contact us actions