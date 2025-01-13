@Smoke @Regression   # tag=@==> Test type
Feature: Login feature test

Background:
Given open browser
And Go to application login page
 

@Positive @QB41-1    #tag=@==> positive/negative  test case no
Scenario: As a user, I want to login with valid credential and login should be pass


When write valid username in user field 
And write valid password in password field
And Click login button
Then check login status should pass



@Negative @QB41-2  #tag=@==> positive/negative  test case no
Scenario: As a user, I want to login with invalid credential and login should be fail 


When write invalid username in user field 
And write invalid password in password field
And Click login button
Then check login status should fail



@Negative @QB41-3  #tag=@==> positive/negative  test case no
Scenario: As a user, I want to login with null or empty credential and login should be fail 


When write null username in user field 
And write null password in password field
And Click login button
Then check login status should fail

