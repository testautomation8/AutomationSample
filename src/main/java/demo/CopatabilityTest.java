package demo;

import com.googlecode.fightinglayoutbugs.FightingLayoutBugs;
import com.googlecode.fightinglayoutbugs.LayoutBug;
import com.googlecode.fightinglayoutbugs.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.MalformedURLException;
import java.util.Collection;


//Sample to test compatability test automation using GoogleFightingLayout

public class CopatabilityTest {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rydq/Documents/WorkSpace/IntelliJ/AppiumSample/src/resorces/chromedriver");

        WebDriver driver = new ChromeDriver();
        try {
            String testPageUrl = "http://www.test.de/";
            driver.get(testPageUrl);
            WebPage webPage = new WebPage(driver);
            FightingLayoutBugs flb = new FightingLayoutBugs();
            final Collection<LayoutBug> layoutBugs = flb.findLayoutBugsIn(webPage);
            System.out.println("Found " + layoutBugs.size() + " layout bug(s).");
            for (LayoutBug bug : layoutBugs) {
                System.out.println(bug);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
