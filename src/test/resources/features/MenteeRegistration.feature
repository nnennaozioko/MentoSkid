Feature: I want to register to become a mentee.


    Background:
    Given I navigate to the Url
    When I click start as a mentee button
    Then welcome page displayed

  @test
  Scenario Outline: valid mentee registration
   When I enter first name "<firstName>"
   And I enter last name "<lastName>"
   And I enter the email "<emailAddress>"
   And I enter Password "<password>"
  And I click mentee checkbox
    And I click terms and condition
    And I click join now
    #Then page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Markh       |  John      |  markh@gmail.com          |    Mark123@    |
      #|  Eusyh       |   James     |    eusyh@yahoo.com        |   Eusy123$     |

  @test
  Scenario Outline: invalid password mentee registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentee checkbox
    And I click terms and condition
    And I click join now
    #Then welcome page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Marky       |  John      |  marky@gmail.com    |    k123@   |
      #|  Eusyy       |   James    |   eusyy@yahoo.com   |   Eusy1    |

  @test
  Scenario Outline: Invalid  email address mentor registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentee checkbox
    And I click terms and condition
    And I click join now
    #Then welcome page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  MarkG       |  John      |  markgmail.com  |    Mark123@    |
      #|  EusyG      |   James    |    eusyG@yahoo.  |   Eusy123$     |

