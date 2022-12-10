@GroupchatPositive
Feature: User can use Groupcaht properly

  @Positive31
  Scenario: User send chat
    Given  User click nova team
    When User click groupchat box menu
    And User type chat
    And User send chat
    Then User successfully send chat in groupchat

  @Positive32
  Scenario: User delete chat
    Given  User click nova team
    When User click groupchat box menu
    And  User click menu message
    And User click delete message
    And User click delete button
    Then User successfully delete chat in groupchat

  @Positive33
  Scenario: User send mention chat
    Given  User click nova team
    When User click groupchat box menu
    And User type @ in chat
    And User click mention user
    And User send chat
    Then User successfully send mention in groupchat