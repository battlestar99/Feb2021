Feature: suace demo login
@uat
  Scenario Outline: sauce demo login with multiple sets of data
    Given user is on the login page
    When user enters "<username>" in the userid text box
    When user enters "<password>" in the password text box
    And user clicks the login button
    Then user should navigate to the expected "<webpage>"

    Examples: 
      | username                | password     | webpage                                  |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/               |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/               |
      | perfsdfsdaf             | dfasaf       | https://www.saucedemo.com/               |
