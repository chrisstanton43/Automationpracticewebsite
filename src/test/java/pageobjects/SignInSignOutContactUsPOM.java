package pageobjects;

import org.openqa.selenium.By;

import static pageobjects.HomePOM.driver;

/**
 * Created by user1 on 23/02/2017.
 */
public class SignInSignOutContactUsPOM {

//    private static WebDriver driver = new FirefoxDriver();

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
