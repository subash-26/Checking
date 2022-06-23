$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Feature.feature");
formatter.feature({
  "name": "Verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpackage.user_is_on_the_Adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter userName and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpackage.user_should_verify_success_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Signup Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": ","
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpackage.user_is_on_the_Adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter FirstName and LastName and password and confirmPassword",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpackage.user_should_enter_FirstName_and_LastName_and_password_and_confirmPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpackage.user_should_verify_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying ForgetPassword Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpackage.user_is_on_the_Adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click forget Password button and user re-enter the password",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpackage.user_should_click_forget_Password_button_and_user_re_enter_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify login fucntionality again",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpackage.user_should_verify_login_fucntionality_again()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});