@Regression
Feature: American Health Care Academy for Multiple user

   Background: Navigate to Login page for Admin
      Given User navigate to Login Page for MultipleUser "https://master2-cpraedcourse.gitview.net/groupadmin/login"

   
   Scenario: verify Dashboard page
      When user enter email "deepak@thinktime.in" password "Thinktime.in"
      Then user is redirected to the Dashboard page
      
      #Scenario: verify store page
      #When user enter email "Hariharan" password "Thinktime@01"
      #Then user is redirected to the store page
      #
      #
      #Scenario: verify Hands-on Kit page
      #When user enter email "Hariharan" password "Thinktime@01"
      #Then user is redirected to the Hands-on Kit page
      #
      #Scenario: verify Student Profile page
      #When user enter email "Hariharan" password "Thinktime@01"
      #Then user is redirected to the Student Profile page
      #
      #Scenario: verify Billing page
      #When user enter email "Hariharan" password "Thinktime@01"
      #Then user is redirected to the Billing page
      #
      #Scenario: verify Contact Us page
      #When user enter email "Hariharan" password "Thinktime@01"
      #Then user is redirected to the Contact Us page
      
  