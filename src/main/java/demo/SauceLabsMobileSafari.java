package demo;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class SauceLabsMobileSafari {

    private AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set my TestObject API Key

        capabilities.setCapability("testobjectApiKey", "EFAB88B1837041F2BC70B165D7A5FE**");

        // Dynamic device allocation of an iPhone 7, running iOS 10.3 device
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("platformVersion", "10.0.2");
        capabilities.setCapability("deviceName", "iPhone 5 Free");
        capabilities.setCapability("browserName", "safari");

        // Set allocation from private device pool only
        //capabilities.setCapability("privateDevicesOnly", "true");

        // Set Application under test
        //capabilities.setCapability("testobject_app_id", "1");
        //capabilities.setCapability("name", "My Test 1!");

        // Set Appium version
        capabilities.setCapability("appiumVersion", "1.7.1");

        // Set Appium end point
        WebDriver driver = new IOSDriver(new URL("https://us1.appium.testobject.com/wd/hub"), capabilities);

        try {

            driver.manage().deleteAllCookies();

            // Open url
            driver.get("http://www.facebook.com");

            // print the title
            System.out.println("Title " + driver.getTitle());

            // enter username
            driver.findElement(By.name("email")).sendKeys("rao@gmail.com");

            // enter password
            driver.findElement(By.name("pass")).sendKeys("MRushi_0");

            // click on submit button
            driver.findElement(By.id("u_0_5")).click();

        } catch (Exception e) {

        } finally {
            driver.quit();
        }

    }

}
