@BlastNegative
Feature: User can use Blash properly

  @Negative
  Scenario: User create blast without title
    Given User click nova team
    When User click blast box menu
    And User click create blast button
    And User type a description blast
    And User click publish button
    Then User cant create blash without title

  @Negative
  Scenario: User create blast without description
    Given User click nova team
    When User click blast box menu
    And User click create blast button
    And User type a title blast
    And User click publish button
    Then User cant create blash without description

  @Negative
  Scenario: User edit without subcriber in blast
    Given User click nova team
    When User click blast box menu
    And User choose blast
    And User click dot three icon
    And User click edit
    And User click plus button in blast
    And user removes all sucriber
    And User click save changes
    Then User can edit without subcriber in blast