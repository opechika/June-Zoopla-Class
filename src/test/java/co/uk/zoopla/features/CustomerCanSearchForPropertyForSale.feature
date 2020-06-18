@regression
Feature: For Sale Search
  As a customer
  I want the ability to search for any properties of my choice
  So that I can choice one to buy

  @smokeTest
  Scenario Outline: Customer can Search for any property
    Given I navigate to Zoopla homepage
    When I enter "<Location>" into the search field
    And I select "<MinPrice>" from Min price
    And I select "<MaxPrice>" from Max price
    And I select "<PropertyType>" from Property type
    And I select "<NoOfBeds>" from Bedrooms
    And I click on Search button
    Then the search for "<Location>" is displayed
    And I click on one of the search result

  Examples:
  | Location | MinPrice | MaxPrice |PropertyType|NoOfBeds|
 # |London  |No min  |No max  |Show all    |No min  |
  |London  |£120,000  |No max  |Show all    |No min  |
#  |London  |No min  |£400,000  |Show all    |No min  |
#  |London  |£120,000  |£400,000  |Show all    |No min  |
#  |London  |£120,000  |£400,000  |Houses    |No min  |
#  |London  |£120,000  |£400,000  |Show all    |3+  |
#  |OL9 8LE  |£120,000  |£400,000  |Show all    |3+  |
#  |Piccadilly Station  |£120,000  |£400,000  |Show all    |3+  |



  @error
  Scenario Outline: Error page is displayed for search
    Given I navigate to Zoopla homepage
    When I enter "<Location>" into the search field
    And I select "<MinPrice>" from Min price
    And I select "<MaxPrice>" from Max price
    And I select "<PropertyType>" from Property type
    And I select "<NoOfBeds>" from Bedrooms
    And I click on Search button to expect error
    Then an error page is displayed

    Examples:
      | Location | MinPrice | MaxPrice |PropertyType|NoOfBeds|
      |NNNNNN  |No min  |No max  |Show all    |No min  |