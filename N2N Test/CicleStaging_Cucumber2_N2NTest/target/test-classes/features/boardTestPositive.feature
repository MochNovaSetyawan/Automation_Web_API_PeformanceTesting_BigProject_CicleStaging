@BoardPositive
Feature: User can use board properly

  @Positive01
  Scenario: User create new board list
    Given User click nova team
    When User click board box menu
    And User click add new list
    And User type list Coloumn
    And User click create button
    Then User can see the result of create new board

  @Positive02
  Scenario: User create new card
    Given User click nova team
    When User click board box menu
    And User click add card
    And User type card name
    And User click add card button
    Then User can see the result of create new card

  @Positive03
  Scenario: User edit board list
    Given User click nova team
    When User click board box menu
    And User click list name
    And User type edit list coloumn
    Then User successfully edit board list

  @Positive04
  Scenario: User edit card
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click card name
    And User type edit card coloumn
    Then User successfully edit card

  @Positive05
  Scenario: User add description
    Given User click nova team
    When User click board box menu
    And User choose card
    And User type description
    And User click Save button
    Then User successfully edit description

  @Positive06
  Scenario: User edit description
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click notes button
    And User type edit description
    And User click Save button
    Then User successfully edit description

  @Positive07
  Scenario: User add comment in board
    Given User click nova team
    When User click board box menu
    And User choose card
    And User type comment
    And User click post button
    Then User successfully add comment in board

  @Positive08
  Scenario: User add subcriber in board
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click plus button in board
    And User click apply member button
    Then User can add sucriber in board

  @Positive09
  Scenario: User create label
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click label button
    And User click add label button
    And User type name label coloumn
    And User choose color label
    And User click create button
    Then User can add label in board

  @Positive10
  Scenario: User add label
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click label button
    And User choose label
    And User click apply labels
    Then User successfully add label

  @Positive11
  Scenario: User remove label
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click label button
    And User click edit label button
    And User click delete button in board
    Then User successfully delete label

  @Positive12
  Scenario: user move card list
    Given User click nova team
    When User click board box menu
    And User choose move card
    And User click move button
    And User click move list
    And User choose move list
    And User click move
    Then User successfully move card
#    And User card back to normal

  @Positive13
  Scenario: User send attachment in board
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click attachment button
    And User send Attachment
    And User successfully send attachment

  @Positive14
  Scenario: User edit attachment in board
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click edit
    And User type link name
    And User click update
    Then User successfully edit name attachment

  @Positive15
  Scenario: User delete attachment in board
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click delete in attachment
    And User click delete
    Then User successfully delete attachment

  @Positive16
  Scenario: User makes the card private
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click private card
    Then User successfully makes the card private

  @Positive17
  Scenario: User makes the card public
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click public card
    Then User successfully makes the card public

  @Positive18
  Scenario: User set due date
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click due date button
    And User type date
    And User type time
    And User click Save button
    Then User successfully set due date

  @Positive19
  Scenario: User remove due date
    Given User click nova team
    When User click board box menu
    And User choose card
    And User click due date button
    And User click remove button
    Then User successfully remove due date

