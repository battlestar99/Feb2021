

Feature: validating the login elements 

@smoke @uat
Scenario: validaint if the login elements are present 

Given user is on the home page
When user see the login text box 
Then user should be able to type user name 
When user see the password text box
Then user should be able to type password 
When user see the login button 
Then user should be able to click on login