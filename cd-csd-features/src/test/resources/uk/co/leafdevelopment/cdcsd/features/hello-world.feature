Feature: Friendly greeting

  In order to demonstrate the sdlc with continuous delivery
  As a developer with little time on his hands
  I want to ask an application to say hello to me in a few different ways

  Scenario: Say hello not knowing my name
    Given I dont tell them my name
    When I say hello
    Then they will respond with Hello mate

  Scenario: Say hello when you know my name
    Given I have told you my name is "Lea"
    When I say hello
    Then they will respond with Hello "Lea"