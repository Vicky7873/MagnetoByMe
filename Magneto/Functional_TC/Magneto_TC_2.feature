Feature: List Page and detail page

Scenario: Verify that cost of product in lisp page and details page are equal

Given open the url
Then click on mobile menu
And Read the cost of sony xperia
Then click on sony xperia
And Read the sony xperia mobile from detail page
Then compare the value of step 3 and step 5