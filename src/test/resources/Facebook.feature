Feature: Facebook testing

Scenario: Check login functionality
Given The facebook page is open 
When User enters <username> and <password>
And Click on login button 
Then Close the browser

Examples:
|username|password|
|user1|pwd1|
|user2|pwd2|