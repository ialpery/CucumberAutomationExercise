Feature: Subscription in Cart Page

  @smoke
  Scenario: TC11_User will subscribe in cart page

    Given User navigated to url
    When Verify that home page is visible successfully
    And Click cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Wait 2 seconds
    And Verify success message You have been successfully subscribed! is visible
    Then The page will closed

  Scenario: TC12_Add products in cart

    Given User navigated to url
    When Verify that home page is visible successfully
    And Click Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click  Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price
    Then The page will closed