package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePOM;
import pageobjects.SignInSignOutContactUsPOM;

import java.util.concurrent.TimeUnit;

import static pageobjects.HomePOM.driver;


public class SignInSignOutContactUsDefs extends SignInSignOutContactUsPOM {

    @When("^I click on sign in link$")
    public void i_click_on_sign_in_link() throws Throwable {

        HomePOM.clickOnSignIn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("^I enter the email address and password$")
    public void i_enter_the_email_address_and_password() throws Throwable {
        SignInSignOutContactUsDefs.EmailAddrees();
        SignInSignOutContactUsDefs.Password();
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        HomePOM.SignOut();

    }

    @When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        HomePOM.getHomePage();

    }

    @Then("^I perform contact us actions$")
    public void i_perform_contact_us_actions() throws Throwable {
        HomePOM.ContactUs();


    }
}
