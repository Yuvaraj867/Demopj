Feature: this is login feature for Orange HRM
Scenario Outline: this is login scenario
Given proceed to login page
When user enters "<Username>" "<Password>"
And click the final button
Examples:
|Username| |Password|
|adm|      |admin123|
|Admin|    |adminee|
|wed|      |thursday|
|Admin|    |admin123|