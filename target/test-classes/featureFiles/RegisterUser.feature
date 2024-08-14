Feature: User registration in AutomationExcercise E-commerce application

Scenario: user registration with correct email and name

When browser is launched and user lands on the home page
Then verify home page is visible
And user navigates to signup page
And verify 'New User Signup!' visibility
When user enters 'Nikkie' and 'Nikkie12327@gmail.com' address
Then verify 'ENTER ACCOUNT INFORMATION' is visible
And user fills the details for registration
And verify 'ACCOUNT CREATED!' is visible and continue in registration page
And verify Logged in as 'Nikkie' is visible
When user deletes the account
Then verify 'ACCOUNT DELETED!' is visible and continue for home page

Scenario: user redistration while checkout

When browser is launched and user lands on the home page
Then verify home page is visible
Then user add products to cart with ids
| 2 |
| 7 |
| 8 |
| 4 |
| 6 |
And verify cart page is visible
And user proceed to checkout the products before registration
And user navigates to signup page
When user enters 'Nikkie' and 'Nikkie12327@gmail.com' address
And user fills the details for registration
And verify 'ACCOUNT CREATED!' is visible and continue in registration page
And verify Logged in as 'Nikkie' is visible
When user navigates to cart page and proceed to checkout
Then verify address details and review the order
And user enter the payment details and confirm order
And verify 'Your order has been placed successfully!' is displayed
When user deletes the account
Then verify 'ACCOUNT DELETED!' is visible and continue for home page

Scenario: user redistration before checkout

When browser is launched and user lands on the home page
Then verify home page is visible
And user navigates to signup page
When user enters 'Nikkie' and 'Nikkie12327@gmail.com' address
And user fills the details for registration
And verify 'ACCOUNT CREATED!' is visible and continue in registration page
And verify Logged in as 'Nikkie' is visible
When user add products to cart with ids
| 2 |
| 7 |
| 8 |
| 4 |
| 6 |
When user navigates to cart page and proceed to checkout
Then verify address details and review the order
And user enter the payment details and confirm order
And verify 'Your order has been placed successfully!' is displayed

Scenario: user registration with existing email

When browser is launched and user lands on the home page
Then verify home page is visible
And user navigates to signup page
And verify 'New User Signup!' visibility
When user enters 'Nikkie' and 'Nikkie12327@gmail.com' address
Then verify 'Email Address already exist!' error is displayed


