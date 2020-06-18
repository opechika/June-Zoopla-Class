@regression
Feature: For Rent Search
  As a customer
  I want the ability to search for any properties of my choice
  So that I can choice one to buy

  @forRent @smokeTest
  Scenario Outline: Customer can Search for any property
    Given I navigate to Zoopla homepage
    And I click on for rent tab
    When I enter "<Location>" into the search field
    And I select "<MinPrice>" from rental Min price
    And I select "<MaxPrice>" from rental Max price
    And I select "<PropertyType>" from Property type
    And I select "<NoOfBeds>" from Bedrooms
    And I click on Search button
    Then the search for "<Location>" is displayed
    And I click on one of the search result

    Examples:
      | Location | MinPrice | MaxPrice |PropertyType|NoOfBeds|
      |London  |£1,000 pcm  |£2,000 pcm  |Show all    |No min  |
