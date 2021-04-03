Feature: this is a sample data driven testing

  Scenario Outline: sauce demo login with multiple sets of data
    Given user is on the yahoo sign up page
    When user enters firstname "<firstName>" for yahoo sign up page
    When user enters lastname "<lastName>" for yahoo sign up page

    Examples: 
      | firstName | lastName |
      | jon       | krax     |
      | mike      | shur     |
      | razin     | anik     |
