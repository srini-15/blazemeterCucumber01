@SmokeTest
Feature: Purchase ticket feature

  Scenario: Try to purchase the ticket with valid data's
    Given user launches the browser
    Then Enter the url as "https://blazedemo.com/"
    When check the title as "BlazeDemo"
    Then select departure as "Mexico City" and arrive to "New York"
    And click on find flights
    When check the title as "BlazeDemo - reserve"
    And click on third option
    When check the title as "BlazeDemo Purchase"
    Then enter the valid details "sankari"
    And Scroll the page till purchase button
    Then click purchase flights
    And check the page as "BlazeDemo Confirmation"
    And close the browser

    #Examples: 
     # | url                      | depart        | arrive     | name      |
     # | "https://blazedemo.com/" | Mexico City | New York | "sankari" |
