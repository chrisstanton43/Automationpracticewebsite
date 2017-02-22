package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.Pages;

import javax.security.auth.callback.TextInputCallback;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefs extends Pages{

    WebDriver driver = new FirefoxDriver();

    @Given("^I am on automationpractice website$")
    public void i_am_on_automationpractice_website() throws Throwable {

        Pages.getHomePage();
    }

    @When("^I click on SignIn link$")
    public void i_click_on_SignIn_link() throws Throwable {

        Pages.clickOnSignIn();
    }

    @When("^I enter the email address$")
    public void i_enter_the_email_address() throws Throwable {

        Pages.enterEmailId();
    }

    @Then("^I click on create an account button$")
    public void i_click_on_create_an_account_button() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();

    }

    @Then("^I fill \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
    public void i_fill( String title,String firstname, String lastname, String password, String dateofbirth) throws Throwable {


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("id_gender1")).click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='customer_firstname']")));
        driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys(firstname);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys(lastname);
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='account-creation_form']/div[1]/div[6]/div")).sendKeys(dateofbirth);
        driver.findElement(By.xpath(".//*[@id='firstname']")).clear();
        driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys(firstname);
        driver.findElement(By.xpath(".//*[@id='lastname']")).clear();
        driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys(lastname);

    }

    @Then("^I fill \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
    public void i_fill_and( String address, String city, String state, String postcode, String mobilenumber) throws Throwable {

        driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(address);
        driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(city);
        Select state_select = new Select(driver.findElement(By.xpath(".//*[@id='id_state']")));
        state_select.selectByVisibleText("New York");
        driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys(postcode);
        driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys(mobilenumber);
    }

    @Then("^I hit Register button$")
    public void i_hit_Register_button() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='submitAccount']")).click();

    }



}
