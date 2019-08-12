Feature: check TeamX app
Background:opening application
 Given Open TeamX page			
@regression
 Scenario: Verification of title
 Then verify title
 @sanity1
 Scenario: check for alert for not entering description
  When description blank and click next 
            ||
 Then alert message for entering comes
       
 @smoke
 Scenario Outline: check for final submission
  When enter all "<description>"
 Then check for messages
 Examples:
   |description|
	 |Good Work|
    
 
 
 
  