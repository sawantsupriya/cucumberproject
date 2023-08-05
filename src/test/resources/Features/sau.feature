Feature: open Saucedemo featurewith data table without header
@positive
Scenario: open sauceDemo website and login with data table without header
Given user is entering"https://www.saucedemo.com/"
|standard_user|
|secret_sauce|
When the user clicks and get login
Then close the browser window