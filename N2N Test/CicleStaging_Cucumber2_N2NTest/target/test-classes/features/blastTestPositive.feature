@BlastPositive
Feature: User can use Blash properly

    @Positive20
  Scenario: User create new blash
    Given  User click nova team
    When User click blast box menu
    And User click create blast button
    And User type a title blast
    And User type a description blast
    And User click publish button
    Then User can see the result of create new blast

  @Positive21
  Scenario: User edit blash detail
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User click dot three icon
    And User click edit
    And User type edit a title blast
    And User type edit a description blast
    And User click save changes
    Then User can see the result of edit blast

  @Positive22
  Scenario: User add comment in blash
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User type comment
    And User click post button
    Then User successfully add comment in blast

  @Positive23
  Scenario: User cheers in blash
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User click cheers in blast
    And User type cheers in blast
    And User click checklist button
    Then User successfully cheers in blast

  @Positive24
  Scenario: User edit comment blash
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User click dot three icon comment in blast
    And User click edit
    And User type edit a comment blast
    And User click post button
    Then User can see the result of edit comment in blast

  @Positive25
  Scenario: User edit subcriber blash
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User click dot three icon
    And User click edit
    And User click plus button in blast
    And User add member in blast
    And User click save changes
    Then User can add sucriber in blast

  @Positive26
  Scenario: User edit complete post
    Given  User click nova team
    When User click blast box menu
    And User choose blast
    And User click dot three icon
    And User click edit
    And User click set due date manually
    And User click save changes
    And User click complete post
    Then User successfully edit complete post

   @Positive27
   Scenario: User archive blash
     Given  User click nova team
     When User click blast box menu
     And User choose blast
     And User click dot three icon
     And User click archive button
     And User choose archive
     Then User successfully archive blast
