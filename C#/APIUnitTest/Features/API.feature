Feature: SpecFlowFeature1
	In order to avoid silly mistakes
	As a math idiot
	I want to be told the sum of two numbers


Scenario Outline: CompareAnnual
	Given I have my API ready
	And I have entered '<Id>' for the first one
	And I have entered '<age>' for the second one
	And I have entered '<gender>' for the third one
	And I have entered '<something>' for the fouth one
	When I press add
	Then the result should be '<result>' on the screen

 Examples:
    | Id     | age | gender | something | result	|
    
    
