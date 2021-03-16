@addtobasket
Feature: Add product to Basket
Scenario Outline: Verify functionality to add  product to basket
Given I am on Home page
When I add "<searchoneproduct>" product to the basket
Then I should see "<searchResult>" related products in the basket
Examples:
|searchoneproduct|searchResult|
|Maternity Grey Marl Sweatshirt|https://tuclothing.sainsburys.co.uk/p/Maternity-Stripe-%27Mama%27-Slogan-Top/138197061-Navy?searchTerm=:newArrivals&searchProduct=|



Scenario: Verify functionality to add multiple product to basket
Given I am on Home page
When I search product "Maternity Grey Marl Sweatshirt" and add to basket
And I go and search for second product "Shoes" and add to basket 
Then I should see two  products in the basket

