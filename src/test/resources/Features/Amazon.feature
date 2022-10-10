Scenario: To check amazon login page
Given Launch chrome browser
When End the amazon Url 
Then I enter the valid username and Password
Then I click the login btn
And I verify the home page are dispalyed or not
