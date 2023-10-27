Feature: Subscription in Cart Page

  Scenario: User will subscribe in cart page

    Given user navigated to url
    When Verify that home page is visible successfully
    And Click cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Wait 2 seconds
    And Verify success message You have been successfully subscribed! is visible
    Then The page will closed