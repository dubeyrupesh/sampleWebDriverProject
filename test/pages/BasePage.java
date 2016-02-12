package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by rupeshdubey on 13/02/16.
 */
public class BasePage  {
    static public WebDriver driver;

    public BasePage(WebDriver driver){
        driver= this.driver;
    }
}
