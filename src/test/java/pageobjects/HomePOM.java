package pageobjects;

import org.junit.Assert;
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

    public static void windowMaximize(){
        driver.manage().window().maximize();
    }

    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

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


// >>>>>>>>>>>>>>>>>>>>>>>>>>>>    Methods for PageLogo StepDefs  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

public static void verifyPageLogo(){
    boolean ImageStatus = driver.findElement(By.xpath(".//*[@id='header_logo']/a/img")).isDisplayed();
    System.out.println(ImageStatus);
    String ImageTitle = driver.findElement(By.xpath(".//*[@id='header_logo']/a/img")).getAttribute("title");
    System.out.println(ImageTitle);
}

public static void verifyHomePageTitle(){
    String expTitle = "My Store";
    String actTitle = driver.getTitle();
    Assert.assertEquals(actTitle,expTitle);
    System.out.println("the Title of Home page is: "+actTitle);

}

//  >>>>>>>>>>>>>> Methods for Information Step defs <<<<<<<<<<<<<<<<<<<<<<<<

    public static void clickOnSpecials(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[1]/a")).click();
    }
    public static void specialspage(){
        String expTitle = "Prices drop - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of specials page is: "+actTitle);
    }

    public static void clickOnNewProduct(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[2]/a")).click();
    }
    public static void newProductspage(){
        String expTitle = "New products - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of New products page is: "+actTitle);
    }

    public static void clickOnBestSeller(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[3]/a")).click();
    }
    public static void bestSellerspage(){
        String expTitle = "Best sales - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of Best seller page is: "+actTitle);
    }

    public static void clickOnOurStores(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[4]/a")).click();
    }
    public static void outStorespage(){
        String expTitle = "Stores - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of Our stores page is: "+actTitle);
    }
    public static void clickOnContactUs(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[5]/a")).click();
    }

    public static void contactUspage(){
        String expTitle = "Contact us - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of Contact page is: "+actTitle);
    }
    public static void clickOnTerms(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[6]/a")).click();
    }

    public static void termspage(){
        String expTitle = "Terms and conditions of use - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of Terms page is: "+actTitle);
    }

    public static void clickOnAboutUs(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[7]/a")).click();
    }
    public static void aboutUspage(){
        String expTitle = "About us - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of About page is: "+actTitle);
    }

    public static void clickOnSitemap(){
        driver.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li[8]/a")).click();
    }
    public static void sitemappage(){
        String expTitle = "Sitemap - My Store";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        System.out.println("the Title of Sitemap page is: "+actTitle);
    }



//>>>>>>>>>>>>>>>>> Method for closing browser <<<<<<<<<<<<<<<<<<<<<<<

    public static void browserClose(){
    driver.close();
    }

}
