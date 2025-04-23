Feature: Place order for products

@Checkout
Scenario Outline: Search Expereince for product search in both home and offers page

Given User is on Greencart Landing Page
When user with shortname <Name> and extracted actual name of product
And Added "3" items of selected product to cart
Then user proceeds to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom |
