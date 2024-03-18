
@Verifytimesheet
Feature: To view the pending time sheets
Scenario: To verify the pending timesheets

Given the user successfully login to the application
When the user clicks on the time submenu
And the user search the "Employee name"
And the user clicks on the view button
Then the user view the message as "<message>"
