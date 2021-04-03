$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginElement.feature");
formatter.feature({
  "line": 3,
  "name": "validating the login elements",
  "description": "",
  "id": "validating-the-login-elements",
  "keyword": "Feature"
});
formatter.before({
  "duration": 114500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "validaint if the login elements are present",
  "description": "",
  "id": "validating-the-login-elements;validaint-if-the-login-elements-are-present",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user see the login text box",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be able to type user name",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user see the password text box",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should be able to type password",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user see the login button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user should be able to click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 5865882100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_see_the_login_text_box()"
});
formatter.result({
  "duration": 19200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_type_user_name()"
});
formatter.result({
  "duration": 35700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_see_the_password_text_box()"
});
formatter.result({
  "duration": 17300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_type_password()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_see_the_login_button()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_click_on_login()"
});
formatter.result({
  "duration": 15700,
  "status": "passed"
});
formatter.after({
  "duration": 1337637300,
  "status": "passed"
});
formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "sample feature to learning cucumber",
  "description": "",
  "id": "sample-feature-to-learning-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 32000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "sample scneario to learn cucumber",
  "description": "",
  "id": "sample-feature-to-learning-cucumber;sample-scneario-to-learn-cucumber",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "b",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "c",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "d",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "e",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.a()"
});
formatter.result({
  "duration": 148500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.b()"
});
formatter.result({
  "duration": 92800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.c()"
});
formatter.result({
  "duration": 75400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.d()"
});
formatter.result({
  "duration": 74400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.e()"
});
formatter.result({
  "duration": 65900,
  "status": "passed"
});
formatter.after({
  "duration": 181100,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.stepDef.teardown(stepDef.java:90)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.uri("saucoDemoData.feature");
formatter.feature({
  "line": 1,
  "name": "suace demo login",
  "description": "",
  "id": "suace-demo-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003cusername\u003e\" in the userid text box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cpassword\u003e\" in the password text box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"\u003cwebpage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "webpage"
      ],
      "line": 11,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 12,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;2"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 13,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;3"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 14,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;4"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 15,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;5"
    },
    {
      "cells": [
        "perfsdfsdaf",
        "dfasaf",
        "https://www.saucedemo.com/"
      ],
      "line": 16,
      "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"standard_user\" in the userid text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"secret_sauce\" in the password text box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"https://www.saucedemo.com/inventory.html\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3132968400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_userid_text_box(String)"
});
formatter.result({
  "duration": 81427500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_password_text_box(String)"
});
formatter.result({
  "duration": 73457300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 92662000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 38
    }
  ],
  "location": "stepDef.user_should_navigate_to_the_expected(String)"
});
formatter.result({
  "duration": 24600400,
  "status": "passed"
});
formatter.after({
  "duration": 845808000,
  "status": "passed"
});
formatter.before({
  "duration": 36500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"locked_out_user\" in the userid text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"secret_sauce\" in the password text box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"https://www.saucedemo.com/\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3160991000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_userid_text_box(String)"
});
formatter.result({
  "duration": 94457700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_password_text_box(String)"
});
formatter.result({
  "duration": 63572700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 52636300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 38
    }
  ],
  "location": "stepDef.user_should_navigate_to_the_expected(String)"
});
formatter.result({
  "duration": 5057000,
  "status": "passed"
});
formatter.after({
  "duration": 787357900,
  "status": "passed"
});
formatter.before({
  "duration": 24600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"problem_user\" in the userid text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"secret_sauce\" in the password text box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"https://www.saucedemo.com/\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3181497500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_userid_text_box(String)"
});
formatter.result({
  "duration": 92099800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_password_text_box(String)"
});
formatter.result({
  "duration": 62702900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 89843700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 38
    }
  ],
  "location": "stepDef.user_should_navigate_to_the_expected(String)"
});
formatter.result({
  "duration": 14616800,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...//www.saucedemo.com/[]\u003e but was:\u003c...//www.saucedemo.com/[inventory.html]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDef.stepDef.user_should_navigate_to_the_expected(stepDef.java:220)\r\n\tat ✽.Then user should navigate to the expected \"https://www.saucedemo.com/\"(saucoDemoData.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 819785800,
  "status": "passed"
});
formatter.before({
  "duration": 14200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"performance_glitch_user\" in the userid text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"secret_sauce\" in the password text box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"https://www.saucedemo.com/\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3146309700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_userid_text_box(String)"
});
formatter.result({
  "duration": 88126800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_password_text_box(String)"
});
formatter.result({
  "duration": 70865800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 5086303100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 38
    }
  ],
  "location": "stepDef.user_should_navigate_to_the_expected(String)"
});
formatter.result({
  "duration": 16918300,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...//www.saucedemo.com/[]\u003e but was:\u003c...//www.saucedemo.com/[inventory.html]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDef.stepDef.user_should_navigate_to_the_expected(stepDef.java:220)\r\n\tat ✽.Then user should navigate to the expected \"https://www.saucedemo.com/\"(saucoDemoData.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 843619100,
  "status": "passed"
});
formatter.before({
  "duration": 13100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "suace-demo-login;sauce-demo-login-with-multiple-sets-of-data;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"perfsdfsdaf\" in the userid text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"dfasaf\" in the password text box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to the expected \"https://www.saucedemo.com/\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3126327200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "perfsdfsdaf",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_userid_text_box(String)"
});
formatter.result({
  "duration": 86232700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dfasaf",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_password_text_box(String)"
});
formatter.result({
  "duration": 59632000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 49187600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 38
    }
  ],
  "location": "stepDef.user_should_navigate_to_the_expected(String)"
});
formatter.result({
  "duration": 6296300,
  "status": "passed"
});
formatter.after({
  "duration": 779680000,
  "status": "passed"
});
formatter.uri("web.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# author: razin anik"
    },
    {
      "line": 2,
      "value": "#date : 04/03/2021"
    }
  ],
  "line": 5,
  "name": "validating the login feature",
  "description": "",
  "id": "validating-the-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11700,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 5097128000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "positive testing for login",
  "description": "",
  "id": "validating-the-login-feature;positive-testing-for-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user enters right username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters right password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_enters_right_username()"
});
formatter.result({
  "duration": 87583900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_right_password()"
});
formatter.result({
  "duration": 77602600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 123282400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 22635500,
  "status": "passed"
});
formatter.after({
  "duration": 767181100,
  "status": "passed"
});
formatter.before({
  "duration": 31600,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3186121400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Negative testing for login",
  "description": "",
  "id": "validating-the-login-feature;negative-testing-for-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user enters wrong username",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters worng password",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_enters_wrong_username()"
});
formatter.result({
  "duration": 96146000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_worng_password()"
});
formatter.result({
  "duration": 69566400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 53244700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_not_be_able_to_login()"
});
formatter.result({
  "duration": 4820800,
  "status": "passed"
});
formatter.after({
  "duration": 751347500,
  "status": "passed"
});
formatter.uri("webTestData.feature");
formatter.feature({
  "line": 1,
  "name": "this is a sample data driven testing",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname \"\u003cfirstName\u003e\" for yahoo sign up page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters lastname \"\u003clastName\u003e\" for yahoo sign up page",
  "keyword": "When "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName"
      ],
      "line": 9,
      "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;1"
    },
    {
      "cells": [
        "jon",
        "krax"
      ],
      "line": 10,
      "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;2"
    },
    {
      "cells": [
        "mike",
        "shur"
      ],
      "line": 11,
      "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;3"
    },
    {
      "cells": [
        "razin",
        "anik"
      ],
      "line": 12,
      "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname \"jon\" for yahoo sign up page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters lastname \"krax\" for yahoo sign up page",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 3779482800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jon",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_firstname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 74229700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krax",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_lastname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 66616900,
  "status": "passed"
});
formatter.after({
  "duration": 731855100,
  "status": "passed"
});
formatter.before({
  "duration": 28700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname \"mike\" for yahoo sign up page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters lastname \"shur\" for yahoo sign up page",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 5599083800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_firstname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 64547100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shur",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_lastname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 66230900,
  "status": "passed"
});
formatter.after({
  "duration": 778959100,
  "status": "passed"
});
formatter.before({
  "duration": 13100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "sauce demo login with multiple sets of data",
  "description": "",
  "id": "this-is-a-sample-data-driven-testing;sauce-demo-login-with-multiple-sets-of-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname \"razin\" for yahoo sign up page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters lastname \"anik\" for yahoo sign up page",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 5651866200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "razin",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_firstname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 75220200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anik",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_lastname_for_yahoo_sign_up_page(String)"
});
formatter.result({
  "duration": 74029700,
  "status": "passed"
});
formatter.after({
  "duration": 752414200,
  "status": "passed"
});
});