Feature: For Rent Search
  As a customer
  I want the ability to search for any properties of my choice
  So that I can choice one to rent

  Scenario Outline: Customer can Search for any property for rent
    Given I navigate to Zoopla homepage
    When I enter "<Location>" into the search field
    And I select "<MinPrice>" from Min price for rent
    And I select "<MaxPrice>" from Max price for rent
    And I select "<PropertyType>" from Property type
    And I select "<NoOfBeds>" from Bedrooms
    And I click on Search button
    Then the search for "<Location>" is displayed
    And I click on one of the search result

    Examples:
      | Location | MinPrice | MaxPrice |PropertyType|NoOfBeds|
      |London  |No min  |No max  |Show all    |No min  |