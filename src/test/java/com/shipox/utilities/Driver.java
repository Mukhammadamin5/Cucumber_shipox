package com.shipox.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
     * Making our driver "driver" instance private, so that it is not reachable from outside the class
     * We make it static, because we want it to run before anything else, also we will use it in static method
     * */
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
     * Creating a private constructor, so we are closing access to the object this class from outside any class
     * */
    private Driver() {}

    /*
     * Create re-usable utility method which will return some driver instance when we call it.
     * */
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            String browser = ConfigurationReader.getProperty("browser");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("lang=en-GB");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(options));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                    break;
            }
//            webDriver.manage().window().maximize();
//            webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        return driverPool.get();
    }

    public static WebDriver driver;

    //private static WebDriver getDriver(){}


    public static void closeDriver(){
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this will kill the session but driver will not be null
//            driverPool.set(null);
        }
    }
}