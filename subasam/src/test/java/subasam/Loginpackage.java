package subasam;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpackage {


@Given("User is on the Adactin page")
public void user_is_on_the_Adactin_page() {
	 System.out.println("Lanuch");
}

@When("User should enter userName and password")
public void user_should_enter_userName_and_password() {
	System.out.println("username and password");
}

@Then("User should verify success message")
public void user_should_verify_success_message() {
	System.out.println("Verify Sucess message");
}

@When("User should enter FirstName and LastName and password and confirmPassword")
public void user_should_enter_FirstName_and_LastName_and_password_and_confirmPassword() {
	System.out.println("FirstName and LastName");
}

@When("User should click forget Password button and user re-enter the password")
public void user_should_click_forget_Password_button_and_user_re_enter_the_password() {
	System.out.println("Forget Password");
}

@Then("User should verify login fucntionality again")
public void user_should_verify_login_fucntionality_again() {
	System.out.println("Login");
}

	}

	
