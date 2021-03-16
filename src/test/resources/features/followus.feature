@followus
Feature: Follow us
Background:
Given I am on Home page
Scenario: Verify follow us functionality with Instagram

When I click Instagram logo next to follow us
And I should be able to enter instragram credentials
|email|gggg@gmail.com|
|password|SSStttt|
Then I should be able to  follow TU using instagram


Scenario: Verify follow us functionality with Google
When I click Google logo next to follow us
And enter the <"email">
|email|
|testloth21@gmail.com|
Then I should be able to follow TU 
