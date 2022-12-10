@BlashPositive
Feature: User can use Blash properly

    @Positive20
  Scenario: User create new blash
    Given  User click nova team
    When User click blash box menu
    And User click create blash button
    And User type a title blash
    And User type a description blash
    And User click publish button
    Then User can see the result of create new blash

  @Positive21
  Scenario: User edit blash detail
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User click dot three icon
    And User click edit
    And User type edit a title blash
    And User type edit a description blash
    And User click save changes
    Then User can see the result of edit blash

  @Positive22
  Scenario: User add comment in blash
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User type comment
    And User click post button
    Then User successfully add comment in blash

  @Positive23
  Scenario: User cheers in blash
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User click cheers in blash
    And User type cheers in blash
    And User click checklist button
    Then User successfully cheers in blash

  @Positive24
  Scenario: User edit comment blash
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User click dot three icon comment in blash
    And User click edit
    And User type edit a comment blash
    And User click post button
    Then User can see the result of edit comment in blash

  @Positive25
  Scenario: User edit subcriber blash
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User click dot three icon
    And User click edit
    And User click plus button in blash
    And User add member in blash
    And User click save changes
    Then User can add sucriber in blash

  @Positive26
  Scenario: User edit complete post
    Given  User click nova team
    When User click blash box menu
    And User choose blash
    And User click dot three icon
    And User click edit
    And User click set due date manually
    And User click save changes
    And User click complete post
    Then User successfully edit complete post

   @Positive27
   Scenario: User archive blash
     Given  User click nova team
     When User click blash box menu
     And User choose blash
     And User click dot three icon
     And User click archive button
     And User choose archive
     Then User successfully archive blash
