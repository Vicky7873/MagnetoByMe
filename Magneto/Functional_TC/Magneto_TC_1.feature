Feature: List Page

Scenario: Verify item in mobile List Page can be sorted by name

Given open the url
Then Verify the title of the home page
And click on mobile menu
Then Verify title of the page
And In the list of all mobil select sortby dropDown as name 
Then Verify all products are sorted by name