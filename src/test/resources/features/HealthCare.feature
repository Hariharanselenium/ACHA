@Regression
Feature: American Health Care Academy for single user

   Background: Navigate to Login page for Admin
      Given User navigate to Login Page for Admin "https://master2-cpraedcourse.gitview.net/user/login?version=v2"
@smoke
   
    Scenario Outline: verify Dashboard page
      When user enter Username "<username>" password "<password>"
      Then user is redirected to the Dashboard page
      Examples:
      |username  |password|
      |Hariharan |Thinktime@01|
      |Harihran  |Thinktime@08|
      
      Scenario: verify store page
      When user enter Username "Hariharan" password "Thinktime@01"
      Then user is redirected to the store page
      
      
      Scenario: verify Hands-on Kit page
      When user enter Username "Hariharan" password "Thinktime@01"
      Then user is redirected to the Hands-on Kit page
      
      Scenario: verify Student Profile page
      When user enter Username "Hariharan" password "Thinktime@01"
      Then user is redirected to the Student Profile page
      
      Scenario: verify Billing page
      When user enter Username "Hariharan" password "Thinktime@01"
      Then user is redirected to the Billing page
      
      Scenario: verify Contact Us page
      When user enter Username "Hariharan" password "Thinktime@01"
      Then user is redirected to the Contact Us page
      
  