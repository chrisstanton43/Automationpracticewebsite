package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePOM;

import java.util.concurrent.TimeUnit;


public class HomePageStepDefs extends HomePOM {

//    WebDriver driver = new FirefoxDriver();

    @Given("^I am on automationpractice website$")
    public void i_am_on_automationpractice_website() throws Throwable {

        HomePOM.getHomePage();
        HomePOM.windowMaximize();
    }

    @When("^I click on SignIn link$")
    public void i_click_on_SignIn_link() throws Throwable {

        HomePOM.clickOnSignIn();
    }

    @When("^I enter the email address$")
    public void i_enter_the_email_address() throws Throwable {

        HomePOM.enterEmailId();
    }

    @Then("^I click on create an account button$")
    public void i_click_on_create_an_account_button() throws Throwable {

        HomePageStepDefs.clickOnCreateButton();
        HomePageStepDefs.implicitWait();

    }

    @Then("^I fill \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
    public void i_fill(String title,String firstname, String lastname, String password, String dateofbirth,String address, String city, String state, String postcode, String mobilenumber) throws Throwable {
        HomePageStepDefs.DataTableValues(title,firstname,lastname,password, dateofbirth,address, city, state, postcode, mobilenumber);

    }

    @Then("^I hit Register button$")
    public void i_hit_Register_button() throws Throwable {

        HomePageStepDefs.ClickOnRegisterButton();

    }



}
