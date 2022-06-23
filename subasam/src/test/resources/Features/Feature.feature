Feature: Verifying Adactin details

@smoke
Scenario: Verifying login Functionality
Given  User is on the Adactin page
When  User should enter userName and password
Then User should verify success message

@sanity , @smoke
Scenario: Verifying Signup Functionality
Given  User is on the Adactin page
When  User should enter FirstName and LastName and password and confirmPassword
Then User should verify success message

@sanity
Scenario: Verifying ForgetPassword Functionality
Given  User is on the Adactin page
When  User should click forget Password button and user re-enter the password
Then User should verify login fucntionality again


Scenario: Verifying ForgetPassword Functionality
Given  User is on the Adactin page
When  User should click forget Password button and user re-enter the password
Then User should verify login fucntionality again





