@login
Feature: Login page new features

Scenario: Validate login page with valid data
Given open browser as "chrome"
When enter url as "sample url1"
When enter user name as "user1"
And enter password as "pass123"
But dont click remember checkbox
When click login button
Then verify welcome page as "welcome user1"
