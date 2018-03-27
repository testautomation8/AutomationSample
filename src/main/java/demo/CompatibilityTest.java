package demo;

import com.googlecode.fightinglayoutbugs.FightingLayoutBugs;
import com.googlecode.fightinglayoutbugs.LayoutBug;
import com.googlecode.fightinglayoutbugs.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Collection;


//Sample to test compatability test automation using GoogleFightingLayout

public class CompatibilityTest {


    public static void main(String[] args){
        String localDir = System.getProperty("user.dir");
        File file = new File(localDir + "/src/resorces/chromedriver");

        System.setProperty("webdriver.chrome.driver", String.valueOf(file));

        WebDriver driver = new ChromeDriver();
        try {
            //http://www.test.de/
            //https://dlg-test2.ssp-hosting.com/DirectLineUAT2
            String testPageUrl = "https://www.bing.com/";
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
