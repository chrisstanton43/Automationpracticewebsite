package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class HomePOM {

    public static WebDriver driver=new FirefoxDriver();

    public  static void getHomePage(){
        driver.get("http://automationpractice.com");
    }

    public static void clickOnSignIn(){
        driver.findElement(By.linkText("Sign in")).click();

    }

    public static void enterEmailId(){
        driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("chris.stanton43@gmail.com");

    }
    public static  void setPassword(){
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("as543539");
    }
    public static void SignOut(){

        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
    }

    public static void ContactUs(){

        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[5]/a")).click();

    }
    public static void DataTableValues(String title,String firstname, String lastname, String password, String dateofbirth,String address, String city, String state, String postcode, String mobilenumber){
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
        driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(address);
        driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(city);
        Select state_select = new Select(driver.findElement(By.xpath(".//*[@id='id_state']")));
        state_select.selectByVisibleText("New York");
        driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys(postcode);
        driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys(mobilenumber);
    }

    public static void clickOnCreateButton(){

        driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
    }

    public static void ClickOnRegisterButton(){
        driver.findElement(By.xpath(".//*[@id='submitAccount']")).click();
    }

    public static void EmailAddrees(){
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("chris.stanton43@gmail.com");

    }
    public static  void Password(){
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("as543539");
    }

//    public static void SignOut(){
//
//        driver.findElement(By.linkText(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
//    }

}
