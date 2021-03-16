@pagination
Feature: Search page and sorting
Scenario: Verify search page and sorting functionality
Given I am on Home page
When I search for the product
And products are displayed
Then I scroll down and move to another page
And again I scroll down and move to another page