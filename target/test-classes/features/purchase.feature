Feature: Purchase a product from the test site

  Background: Navigate to Homepage
    Given I navigate to the Homepage

    @Purchase
  Scenario: Purchase a summer dress....
    Given I click the summer dresses link from the dresses sub menu
    And I view the products on the page using the "list" view
    And I increase the quantity of products by 1 from the checkout screen
    When I sign in using my account details
    And I confirm my shipping and billing address is correct
    Then I accept the shipping terms and proceed to payment