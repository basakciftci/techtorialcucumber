Feature: This is for web order all products
  @order @smoke
  Scenario: Validation of the header
    Given the user navigate to the web orders page
    When the user provide username "Tester"
    And the user provide  password "test"
    Then the user validate the header text "List of All Orders"