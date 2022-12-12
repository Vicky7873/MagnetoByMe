Feature: Billing Page

Scenario: Verify user is able to purchase product using registered email id 

Given open the url
Then click on my acoount link
And Login application using previously created credentials
Then Click on My WishList
And In next page click Add to cart link
Then click proceed t checkout
And Enter shipping information
Then click on Estimate
And Verify then shipping cost is generated
Then Select shipping cost updated total
Then verify shipping cost is added to total
And click proceed to checkout
Then enter billing information
And in shipping method click continue
Then in payment information select Check/money order radio button click continue
Then click place order button
And verify order is generated note the order number     