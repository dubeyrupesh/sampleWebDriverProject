package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rupeshdubey on 13/02/16.
 */
public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void navigateToModule(String module_id){
        String module = "http://www.sony.co.uk" + "#" + module_id;
        driver.get(module);
    }

    public void favoriteProductFromWhatsHotModule(String productName){
        String favorite_icon = "#related_products_239708797999428628856565863 span[data-product-name="+"'"+ productName+"'"+"] .fonticon-10-favorite";
        driver.findElement(By.cssSelector(favorite_icon)).click();
    }


    public void navigateToHomePage() {
        driver.get("http://www.sony.co.uk");
    }
}
