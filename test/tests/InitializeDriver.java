package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitializeDriver {
    public static WebDriver driver;

    @BeforeMethod
    public void initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1024,1024");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.get("http://www.sony.co.uk");
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void quitDriver(){
        System.out.println("======================CLOSING DRIVER==============");
        driver.close();
    }

}
