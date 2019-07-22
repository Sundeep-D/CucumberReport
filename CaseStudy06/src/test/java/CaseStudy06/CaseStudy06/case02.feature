
Feature: TestMeApp
  

 
  Scenario:Login
    Given Launch the Webbrowser and load TestMe Url
    Then Click on SignIn 
    Then Enter the data
     | username      |     Password   | 
      | AlexUser      |     Alex@123   | 
    
    Then Click on Login button
    
   