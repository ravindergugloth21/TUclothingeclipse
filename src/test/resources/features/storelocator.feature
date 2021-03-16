Feature: Store Locator
Background:
Given I am on Home page
When I click TU store locator link
@store
Scenario Outline: Verify functionality of store locator
And enter the post code "<postcode>"
Then it should display the nearest stores "Store locator search results: IG7 5NP | Tu clothing|"
Examples:
|postcode|
|IG7 5NP|


Scenario Outline: Verify functionality of store locator

And enter the post code "<postcode>"
Then it should display the nearest stores "<detailsOfStore>"
Examples:
|postcode|detailsOfStore|
|ADDIG7 5NP|https://tuclothing.sainsburys.co.uk/store-finder?q=ADDIG7+5NP&CSRFToken=938d05ea-96a2-4179-a008-d796d61789d1|
|AdddLondon|https://tuclothing.sainsburys.co.uk/store-finder?q=AdddLondon&CSRFToken=938d05ea-96a2-4179-a008-d796d61789d1|