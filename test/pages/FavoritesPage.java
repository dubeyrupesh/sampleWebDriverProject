package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rupeshdubey on 13/02/16.
 */
public class FavoritesPage extends BasePage {

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasProduct(String productName) {
        String product = ".gallery span[data-product-name="+productName+ "]";
        return driver.findElement(By.cssSelector(product)).isDisplayed();
    }

    public static void navigateToFavoritesPage() {
        driver.get("http://www.sony.co.uk/my-favorites");
    }
}
