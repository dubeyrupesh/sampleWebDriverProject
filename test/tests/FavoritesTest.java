package tests;

//import tests.InitializeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FavoritesPage;
import pages.HomePage;

public class FavoritesTest extends InitializeDriver{

    @Test
    public void favouriteAProductFromWhatsHotModule() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToModule("related_products_239708797999428628856565863");
        homePage.favoriteProductFromWhatsHotModule("MDR-100AAP");
        FavoritesPage favoritesPage = new FavoritesPage(driver);
        FavoritesPage.navigateToFavoritesPage();
        Thread.sleep(3000);
        Assert.assertTrue(favoritesPage.hasProduct("MDR-100AAP"));
        homePage.navigateToHomePage();


//        String expectedProduct = InitializeDriver.driver.findElement(By.cssSelector("#related_products_239708797999428628856565863 a:nth-child(5) .product-model.l3")).getText();
//        System.out.println(expectedProduct);
//        Thread.sleep(3000);
//        InitializeDriver.driver.findElement(By.cssSelector("#related_products_239708797999428628856565863 span[data-product-name='BDP-S6500'] .fonticon-10-favorite")).click();
//        InitializeDriver.driver.get("http://www.sony.co.uk/my-favorites");
//        Thread.sleep(3000);
//        String actualProductName = InitializeDriver.driver.findElement(By.cssSelector("#gallery5000 .product-model.l3")).getText();
//        Assert.assertEquals(actualProductName, expectedProduct);
    }

//    @Test
//    public void favoriteAProductFromProductPage() throws InterruptedException {
//        InitializeDriver.driver.get("http://www.sony.co.uk/electronics/wireless-speakers/srs-x33");
//        InitializeDriver.driver.findElement(By.cssSelector(".ps-summary .fonticon-10-favorite")).click();
//        InitializeDriver.driver.get("http://www.sony.co.uk/my-favorites");
//        Thread.sleep(3000);
//        Assert.assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".ghost-center")).isDisplayed());
//    }
//
//
//    @Test
//    public void unFavouriteAProductFromProductPage() throws InterruptedException {
//        InitializeDriver.driver.get("http://www.sony.co.uk/electronics/wireless-speakers/srs-x33");
//        InitializeDriver.driver.findElement(By.cssSelector(".ps-summary .fonticon-10-favorite")).click();
//        InitializeDriver.driver.get("http://www.sony.co.uk/my-favorites");
//        Thread.sleep(3000);
//        Assert.assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".ghost-center")).isDisplayed());
//        InitializeDriver.driver.get("http://www.sony.co.uk/electronics/wireless-speakers/srs-x33");
//        InitializeDriver.driver.findElement(By.cssSelector(".ps-summary .fonticon-10-favorite")).click();
//        InitializeDriver.driver.get("http://www.sony.co.uk/my-favorites");
//        Thread.sleep(3000);
//        Assert.assertEquals(InitializeDriver.driver.findElement(By.cssSelector(".t4")).getText(),"You have no favourites");
//    }
}
