@wip
Feature: Shopping cart on an e-commerce website

  Scenario Outline: Customer Registration

    Given I am on automationpractice website
    When I click on SignIn link
    Then I enter the email address
    Then I click on create an account button
    And I fill "<title>" "<firstname>" "<lastname>" "<password>" "<dateofbirth>"
    And I fill "<address>" "<city>" "<state>" "<postcode>" and "<mobilephone>"
    And I hit Register button
    Examples:
      | title | firstname | lastname | password | dateofbirth | address        | city      | state   | postcode | mobilephone |
      | Mr    | Chris     | Stanton  | as543539 | 1/1/2000    | Stanton Street | Newcastle | England | 12345    | 0751102541  |

