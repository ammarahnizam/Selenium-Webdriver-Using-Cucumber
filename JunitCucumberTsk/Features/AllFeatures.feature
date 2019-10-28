Feature: Rental Application

Background:
Given Open Browser
When  Enter the url "https://acme-qa.everreal.co/app/public/apply/d986458c-4423-4441-be64-77774109864b/applications/step2"


Scenario: To verify the Page Title of Rental Application is "Demo"
Then View Page Title


Scenario: To verify the URL of Rental Application is correct
Then View URL



Scenario: To verify the "House Hold Information" tab is highlighted
Then View tab

Scenario: To verify error validation message must appear if user tries to proceed without selecting any value in all three drop-downs
Then View Error Validation Messages


Scenario: To verify the EverReal logo is redirecting towards EverReal Home Page
Then Check Logo 