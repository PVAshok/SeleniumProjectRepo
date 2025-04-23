Feature: Search and place the order for Products

@Search
Scenario Outline: Search Expereince for product search in both home and offers page

Given User is on Greencart Landing Page
When user with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page
And validate product name in offers page matches with landing page

Examples:
| Name |
| Tom |
| Beet |