Feature: user able to login the application and able to search market place

@Sanity
Scenario: user able to login facebook with valid credentials and search marketplace


Given : user able to open any browser
And : user able to open "https://www.facebook.com/" url
And : user able to enter the valid username and password
When : user able to click the log in
Then : user able to enter the page and "Share everyday moments with friends and family." verify the information on the grid