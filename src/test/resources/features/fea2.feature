Feature: BookShelf Page Scenarios

  Scenario: Search BookShelves and Display the Results
    Given Filter  Bookshelves below Rs15000
    And exclude out of stock
    And Select anyone Category (like Wall Shelves / Kid Bookshelves / Study Tables, etc)
    And Sort by price High to Low
    And fetched the items
    When print all details in console output
    Then retrive any one SubMenu data from living menu
