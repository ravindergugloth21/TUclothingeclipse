@login
Feature: Login
Scenario: verify registration
Given I am on Home page
When I click on the link
And enter the details
|email|anand@gmail.com|
|Title|MR|
|FirstName|Anand|
|Surname|Gugloth|
|Password|Sruth1|
|confirmpassword|Sruth1|
Then I should be able to register 

