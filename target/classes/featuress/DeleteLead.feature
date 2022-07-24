Feature: Create Lead functionality

#Background:
#Given Open the Chrome Browser 
#Given Load application url as 'http://leaftaps.com/opentaps'
@Sanity
Scenario Outline: Positive flow for creating a lead

Given Enter username as <username>
And Enter password as <password>
When Click on Login button 
Then HomePage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
And Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
And Enter Company name as <companyname>
And Enter First name as <firname>
And Enter Last name as <lasname>
And Click on create lead button
Then 'View Lead' Page should be displayed

Examples:

|username|password|compname|fname|lname|
|'DemoSalesManager'|'crmsfa'|'TestLeaf'|'sathya'|'rajumohankumar'|


