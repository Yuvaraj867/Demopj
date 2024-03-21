
@validateCEo
Feature: To verify the CEO 
Scenario: validate the CEO 

Given the user successfully logged in to the application
When the user clicks on the directory sub menu
And the user select the job title as "Chief Executive Officer" using "text"
And the user clicks on the search button.
Then the user can view the record found
