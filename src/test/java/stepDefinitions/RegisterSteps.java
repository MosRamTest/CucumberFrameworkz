package stepDefinitions;

import io.cucumber.java.en.*;
import utils.Base;

public class RegisterSteps extends Base{


    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {

        registerPage.clickNavLoginButton();
        registerPage.clickSignUpButton();

    }
    @When("I enter valid first name {}")
    public void i_enter_valid_first_name(String firstName) {

    }
    @And("I enter valid lastName {}")
    public void i_enter_valid_last_name_m(String lastName) {

    }
    @And("I enter valid email {}")
    public void i_enter_valid_email_m(String email) {

    }
    @And("I enter valid password {}")
    public void i_enter_valid_password(String password ) {

    }
    @And("I enter valid confirm password {}")
    public void i_enter_valid_confirm_password(String confirmPassword ) {

    }
    @And("I select valid group {}")
    public void i_select_valid_group(String group) {

    }
    @And("I click the create account button")
    public void i_click_the_create_account_button() {

    }
    @Then("User must get notification : Waiting for admin approval")
    public void user_must_get_notification_waiting_for_admin_approval() {

    }

}
