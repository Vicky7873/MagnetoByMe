Feature: Register Page

  Scenario Outline: Verify that you can create account in e-commerce site and can share wishlist to ohter people using email
  
    Given open the url
     Then click on my acoount link
      And Click create Account link and fill new user information "<First_name>","<Last_name>","<EmailID>","<Password>","<ConfirmPassword>"
     Then Click Register
      And Verify the Registration is done
     When Go to tv menu
     Then add product in your wishlist
      And click Share wishlist
     Then in nextPage enter email and a message and click share wishlist
      And check wislist is shared
  
    Examples: 
      | First_name | Last_name | EmailID         | Password | ConfirmPassword | 
      | User1      | User1     | user1           | 123456   | 123456          | 
