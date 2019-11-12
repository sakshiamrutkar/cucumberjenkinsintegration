Feature:Test Registration
Scenario: Test Registration with valid data

Given user open application
When user clicks on Registration
Then users validates Registration page
When user enter firstname
When user enter lastname
When user enter password
When user enter confirm password
When user click on Register button
Then user validates Registration success