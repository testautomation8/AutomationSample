package demo;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsMacSafari {

    private AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set my TestObject API Key

        capabilities.setCapability("testobjectApiKey", "EFAB88B1837041F2BC70B165D7A5FE**");

        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setCapability("platform", "macOS 10.13");
        caps.setCapability("version", "11.0");

        // Set Appium end point
        WebDriver driver = new RemoteWebDriver(new URL("http://mandadapu:21dcd27d-6811-4de3-b900-dada9c5338**@ondemand.saucelabs.com:80/wd/hub"), caps);

       // WebDriver driver = new SafariDriver();

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

        }catch (Exception e){

        }finally {
            driver.quit();
        }

    }

}
