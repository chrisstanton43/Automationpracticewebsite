package step_definitions;

import cucumber.api.java.en.Then;
import pageobjects.HomePOM;

public class pageLogoStepDefs extends HomePOM {

    @Then("^I should see logo$")
    public void i_should_see_logo() throws Throwable {
       // HomePOM.implicitWait();
HomePOM.verifyPageLogo();
    }

    @Then("^I should see page title as 'My Store'$")
    public void i_should_see_page_title_as_My_Store() throws Throwable {
HomePOM.verifyHomePageTitle();
HomePOM.browserClose();
    }

}
