@Search
Feature: Search

Scenario Outline: Verify search with valid product details
Given I am on Home page
When I enter valid "<searchTerm>" details
Then I should see related "<searchTerm>" products
Examples:
|searchTerm|
|Jeans|
|Black|
|Sustainability|
|134183720|


Scenario Outline: Verify search wiht invalid product details
Given I am on Home page
When I enter invalid "<searchTerm>" details
Then I should see error message for "<searchResult>" details
Examples:
|searchTerm|searchResult|
|888888134183720|https://tuclothing.sainsburys.co.uk/search?text=888888134183720|
|ytilibanuatsus|https://tuclothing.sainsburys.co.uk/search?text=ytilibanuatsus|
|neppencil|https://tuclothing.sainsburys.co.uk/search?text=neppencil|
|@@@@|https://tuclothing.sainsburys.co.uk/search?text=%40%40%40%40|

Scenario: Verify functionality of search with blank product details
Given I am on Home page
When I leave search text box ""blank
Then I should see error message for blank product


Scenario: Verify functionality of search text box
Given I am on Home page
When I click on search text box
Then warning message to be displayed 



