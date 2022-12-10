@BlashNegative
Feature: User can use Blash properly

  @Negative
  Scenario: User create blash without title
    Given User click nova team
    When User click blash box menu
    And User click create blash button
    And User type a description blash
    And User click publish button
    Then User cant create blash without title

  @Negative
  Scenario: User create blash without description
    Given User click nova team
    When User click blash box menu
    And User click create blash button
    And User type a title blash
    And User click publish button
    Then User cant create blash without description

  @Negative
  Scenario: User edit without subcriber in blash
    Given User click nova team
    When User click blash box menu
    And User choose blash
    And User click dot three icon
    And User click edit
    And User click plus button in blash
    And user removes all sucriber
    And User click save changes
    Then User can edit without subcriber in blash