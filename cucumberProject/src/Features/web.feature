# author: razin anik 
#date : 04/03/2021 


Feature: validating the login feature 

Background: 

Given user is on the login page
@smoke
Scenario: positive testing for login 

 
When user enters right username 
And user enters right password 
And user clicks the login button
Then user should be able to login 
@smoke
Scenario: Negative testing for login 

When user enters wrong username 
And user enters worng password
And user clicks the login button
Then user should not be able to login 
