
Feature: Test Login functionality  
	Scenario: Check login is successfull with valid credentials
		Given user open chrome browser
		And user is on the login page
		When user enters a valid <username> and <password> 
		And user clicks on the login button
		Then user is able to login and navigates to homepage 
	
		Examples:
		|username | password |
		|Raghav 	| 12345		 | 
		|Ele			| 12345 	 | 