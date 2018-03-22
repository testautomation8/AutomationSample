
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class StartMacSafari {

    public static void main(String[] args)
    {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.co.in");

        //Find some element
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.click();

    }

}