$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:p3/sce_outline.feature");
formatter.feature({
  "name": "scenario_outline",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to URL",
  "keyword": "Given "
});
formatter.step({
  "name": "enters \"\u003cusername\u003e\" and  \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on signup button",
  "keyword": "When "
});
formatter.step({
  "name": "welcome page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "lalitha",
        "saws"
      ]
    },
    {
      "cells": [
        "sri",
        "4fdv7"
      ]
    },
    {
      "cells": [
        "japan",
        "korea"
      ]
    },
    {
      "cells": [
        "china",
        "dubai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to URL",
  "keyword": "Given "
});
formatter.match({
  "location": "signup.user_navigates_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"lalitha\" and  \"saws\"",
  "keyword": "And "
});
formatter.match({
  "location": "signup.enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "signup.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signup.welcome_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to URL",
  "keyword": "Given "
});
formatter.match({
  "location": "signup.user_navigates_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"sri\" and  \"4fdv7\"",
  "keyword": "And "
});
formatter.match({
  "location": "signup.enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "signup.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signup.welcome_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to URL",
  "keyword": "Given "
});
formatter.match({
  "location": "signup.user_navigates_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"japan\" and  \"korea\"",
  "keyword": "And "
});
formatter.match({
  "location": "signup.enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "signup.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signup.welcome_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to URL",
  "keyword": "Given "
});
formatter.match({
  "location": "signup.user_navigates_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"china\" and  \"dubai\"",
  "keyword": "And "
});
formatter.match({
  "location": "signup.enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "signup.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signup.welcome_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});