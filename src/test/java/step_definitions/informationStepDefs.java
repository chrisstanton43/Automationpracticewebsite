package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePOM;

public class informationStepDefs extends HomePOM{

    @When("^I click 'Specials'$")
    public void i_click_Specials() throws Throwable {
        HomePOM.clickOnSpecials();
    }

    @Then("^I should see new page with the title 'Price drop - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Price_drop_My_Store_opened() throws Throwable {
        HomePOM.specialspage();
    }

    @When("^I click 'New products'$")
    public void i_click_New_products() throws Throwable {
        HomePOM.clickOnNewProduct();
    }

    @Then("^I should see new page with the title 'New products - My Store' opened$")
    public void i_should_see_new_page_with_the_title_New_products_My_Store_opened() throws Throwable {
        HomePOM.newProductspage();
    }

    @When("^I click 'Best sellers'$")
    public void i_click_Best_sellers() throws Throwable {
        HomePOM.clickOnBestSeller();
    }

    @Then("^I should see new page with the title 'Best sales - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Best_sales_My_Store_opened() throws Throwable {
        HomePOM.bestSellerspage();
    }

    @When("^I click 'Our stores'$")
    public void i_click_Our_stores() throws Throwable {
        HomePOM.clickOnOurStores();
    }

    @Then("^I should see new page with the title 'Stores - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Stores_My_Store_opened() throws Throwable {
        HomePOM.outStorespage();
    }

    @When("^I click 'Contact us'$")
    public void i_click_Contact_us() throws Throwable {
        HomePOM.clickOnContactUs();
    }

    @Then("^I should see new page with the title 'Contact us - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Contact_us_My_Store_opened() throws Throwable {
        HomePOM.contactUspage();
    }

    @When("^I click 'Terms and conditions of use'$")
    public void i_click_Terms_and_conditions_of_use() throws Throwable {
        HomePOM.clickOnTerms();
    }

    @Then("^I should see new page with the title 'Terms and conditions of use - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Terms_and_conditions_of_use_My_Store_opened() throws Throwable {
        HomePOM.termspage();
    }

    @When("^I click 'About us'$")
    public void i_click_About_us() throws Throwable {
        HomePOM.clickOnAboutUs();
    }

    @Then("^I should see new page with the title 'About us - My Store' opened$")
    public void i_should_see_new_page_with_the_title_About_us_My_Store_opened() throws Throwable {
        HomePOM.aboutUspage();
    }

    @When("^I click 'Sitemap'$")
    public void i_click_Sitemap() throws Throwable {
        HomePOM.clickOnSitemap();
    }

    @Then("^I should see new page with the title 'Sitemap - My Store' opened$")
    public void i_should_see_new_page_with_the_title_Sitemap_My_Store_opened() throws Throwable {
        HomePOM.sitemappage();
        HomePOM.browserClose();
    }

}
