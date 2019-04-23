# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  Scenario: Home page is displayed
    Given 'www.adidas.mx' page is loaded
    And Hover 'Hombre' tab
    And click button 'Futbol'
    And Get price from first item
    And Click first element
    And Select first size
    And Click button in 'Add to Cart'
    And get amount from item
    And Verify that the amount is 1
    And Click 'See Cart' link
    And Get item name title
    And Verify "CALZADO DE FÚTBOL X 18.3 TF" title is displayed
    And Price should be "1329" USD
    And Price Total should be "$1,428.00" USD





#  Scenario: POSTMAN- GET using java-cucumber-restassure
#    Given GET "/headers" postman endpoint is configured
#    Then the status code should be 200
#
#  Scenario: POSTMAN- Pot using java-cucumber-restassure
#    Given POST "/post" postman endpoint is configured
#    Then the responde 'data' value is "diplomado testing"
#    And the status code should be 200
