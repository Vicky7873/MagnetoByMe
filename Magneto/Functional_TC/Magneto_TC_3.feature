Feature: Detail page Add to cart button

Scenario: Verify that you can not add more products in cart than the product available in store

Given open the url
Then click on mobile menu
And in the list of all mobiles click on add to cart for sony Xperia mobile
Then Change the quantity value to "1000" and click update button
And verify the error message
Then click on empty cart link in the footer of list of all mobiles
Then verify cart is empty