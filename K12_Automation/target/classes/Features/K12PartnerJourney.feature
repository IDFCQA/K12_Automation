Feature: Customer applies for an education loan
@UserRegistrationJourney
Scenario Outline: Customer applies for an educational loan with a partner school
Given Customer launches the Community portal "<URL>"
Then Customer registers himself as a new user providing the following details "<FirstName>" "<LastName>" "<EmailID>" "<MobileNum>"
Then Customer inputs the school and student details "<City>" "<School>" "<Name>" "<Std>" "<Section>" "<Term>" "<CourseFee>" "<Journey>"
Then Customer enters the required loan amount 
Then Customer enters the PAN Number "<PAN>"





Examples:
|                         URL                             |FirstName|LastName|EmailID            |MobileNum |City      |School                  |Name  |Std|Section|Term              |CourseFee|Journey    |PAN       |
|https://k12qa-idfck12.ind3s.sfdc-y37hzm.force.com/idfc/s/|Keshav   |CA      |fajldev67@gmail.com|9031285601|Jamshedpur|Jamshedpur Public School|Keshav|3  |A      |Annual - 12 months|600000   |Non Partner|APJPB0687A|