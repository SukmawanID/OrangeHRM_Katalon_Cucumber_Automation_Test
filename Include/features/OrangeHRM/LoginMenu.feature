Feature: Test Login Menu on OrangeHRM
  
  Scenario Outline: User has successfully login with valid credentials
   Given User open the browser
   When User enters <username> and <password> with valid credentials
   And User clicks on login button
   Then User has successfully logged in to the website OrangeHRM

   
   Examples: |
   		| username | password |
   		| admin    | admin123 |
   		| Admin123 | admin123 |		 
   