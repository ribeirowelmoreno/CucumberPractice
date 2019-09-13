# new feature
# Tags: optional

@Check-what-is-your-favorite-car--UserStory01
Feature: Register a new user

  As a user
  I want to register a new user in the app Selendroid-test-app
  So that a verification user card should appear

  Comment: Depois de criar esse arquivo e instalar o cucumber plugin File->settings->pluggins->cucumber java, clicar com o direito e rodar o cenario, no log vai aparecer a estrutura dos steps para copiar e preencher mais facilmente os steps

@Check-success-message-AcceptanceCriteria01
  Scenario: Enter with correct username and password on the website http://automationpractice.com
    Given user access the Selendroid-test-app app

    When user clicking in StartWebView button

    And insert the username as "<Wellynton>"
    And choose his favorite car
      |Volvo      |
      |Mercedes   |
      |Audi       |
    And click in Send me your name!

    Then I should see what is your favorite car and your name





