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

    And click on WebView chooser list
    And select the WebView type
      |'Say Hello'-Demo      |
      |htmlTestPage          |
      |formPage              |
      |SelectableItemsPage   |
      |nestedPage            |
      |javaScriptPage        |
      |missedJsReferencePage |
      |ActualXhtmlPage       |
      |ClickSource           |
      |Clicks                |
      |Long Content Page     |
      |TestClickPage1        |
      |TestClickPage2        |
      |about:blank           |
      |iframes               |
    And click a link inside the page

    Then user should be the text inside the text box





