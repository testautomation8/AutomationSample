package demo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class StartSafari {

    public static void main(String[] args) throws MalformedURLException {

        // Create object of  DesiredCapabilities class and specify android platform
        DesiredCapabilities capabilities = DesiredCapabilities.iphone();
        capabilities.setCapability("automationName", "XCUITest");


        // set the capability to execute test in chrome browser
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.SAFARI);

        // set the capability to execute our test in Android Platform
        capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.IOS);

        // we need to define platform name
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");

        // Set the device name as well (you can give any name)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"IPhone 6");

        // set the android version as well 
        capabilities.setCapability(MobileCapabilityType.VERSION, "11.0.2");

        // Create object of URL class and specify the appium server address
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        // Create object of  AndroidDriver class and pass the url and capability that we created
        //WebDriver driver = new AndroidDriver(url, capabilities);
        WebDriver driver = new IOSDriver<WebElement>(url, capabilities);

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

        // close the browser
        driver.quit();


    }

}