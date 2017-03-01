@wip
Feature: verify Information column in the footer of the AutomationPractice website

  Scenario: verify Information column

    Given I am on automationpractice website
    When I click 'Specials'
    Then I should see new page with the title 'Price drop - My Store' opened
    When I click 'New products'
    Then I should see new page with the title 'New products - My Store' opened
    When I click 'Best sellers'
    Then I should see new page with the title 'Best sales - My Store' opened
    When I click 'Our stores'
    Then I should see new page with the title 'Stores - My Store' opened
    When I click 'Contact us'
    Then I should see new page with the title 'Contact us - My Store' opened
    When I click 'Terms and conditions of use'
    Then I should see new page with the title 'Terms and conditions of use - My Store' opened
    When I click 'About us'
    Then I should see new page with the title 'About us - My Store' opened
    When I click 'Sitemap'
    Then I should see new page with the title 'Sitemap - My Store' opened
