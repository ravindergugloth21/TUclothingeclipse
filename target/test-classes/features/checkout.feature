@checkout
Feature: Checkout
Background: 
Given I am on Home page
When I add product to basket and click checkout

Scenario: Verify check out functionality for home delivery
And I select home delivery
Then I should be in Home delivery page


Scenario: Verify check out functionality for click and collect
And I select click and collect delivery
Then I should be able to proceed to payment page


