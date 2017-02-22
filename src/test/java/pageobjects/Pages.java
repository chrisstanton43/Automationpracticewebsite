package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user1 on 22/02/2017.
 */
public class Pages {

    private static WebDriver driver=new FirefoxDriver();

    public  static void getHomePage(){
        driver.get("http://automationpractice.com");
    }

    public static void clickOnSignIn(){
        driver.findElement(By.linkText("Sign in")).click();

    }

    public static void enterEmailId(){
        driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("chris.stanton43@gmail.com");

    }

}
