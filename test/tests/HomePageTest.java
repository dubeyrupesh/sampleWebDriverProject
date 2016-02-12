//package tests;
//
//import tests.InitializeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertTrue;
//
//public class HomePageTest extends InitializeDriver {
//    String favorites_page = "http://www.sony.co.uk/my-favorites";
//
//    @Test
//    public void validateMenuOptions() {
//        assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".nav-li-electronics")).isDisplayed());
//        assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".nav-li-playstation")).isDisplayed());
//        assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".nav-li-entertainment")).isDisplayed());
//        assertTrue(InitializeDriver.driver.findElement(By.cssSelector(".nav-li-support")).isDisplayed());
//        InitializeDriver.driver.quit();
//    }
//
//    @Test
//    public void favouriteAProduct() {
//        InitializeDriver.driver.get("http://www.sony.co.uk#related_products_239708797999428628856565863");
//        String favorite_icon_MDR_100_AAP = "#related_products_239708797999428628856565863 span[data-product-name='MDR-100AAP'] .fonticon-10-favorite";
//        InitializeDriver.driver.findElement(By.cssSelector(favorite_icon_MDR_100_AAP)).click();
//        InitializeDriver.driver.get(favorites_page);
//
//        Assert.assertEquals(InitializeDriver.driver.findElement(By.cssSelector(".product-count")).getText(), "1");
//        InitializeDriver.driver.quit();
//    }
//
//    @Test
//    public void testElectronicsMenu() throws InterruptedException {
//        WebElement electronicsMenu = InitializeDriver.driver.findElement(By.cssSelector(".nav-dropdown-toggle"));
//        WebElement camerasLink= InitializeDriver.driver.findElement(By.cssSelector(".navtray-li-cameras"));
//        Actions actions = new Actions(InitializeDriver.driver);
//        actions.moveToElement(electronicsMenu).perform();
//        Thread.sleep(2000);
//        camerasLink.click();
//        System.out.println(InitializeDriver.driver.getCurrentUrl());
//    }
//
//}
