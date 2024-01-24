$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Gujarat university",
  "description": "",
  "id": "gujarat-university",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "login Feature",
  "description": "",
  "id": "gujarat-university;login-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter email address and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_on_Login_Page()"
});
formatter.result({
  "duration": 102926800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefinition.Stepdefinition.user_should_be_on_Login_Page(Stepdefinition.java:20)\r\n\tat ✽.Given user should be on Login Page(src/test/java/com/feature/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_email_address_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});