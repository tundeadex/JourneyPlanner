Feature: As a regular commuter on LondonUnderground, i want to plan my journey

@Journey1
Scenario: Successful journey plan is displayed.
Given I am on LondonUnderground website
When  I entered valid underground stations
Then  Display journey results and journey details


#@Journey2
Scenario: Unsuccessful journey results with invalid underground stations
Given I am on LondonUnderground website
When  I entered invalid LondonUnderground stations
Then  Display no journey results
