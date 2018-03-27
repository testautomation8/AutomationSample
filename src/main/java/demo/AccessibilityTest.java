//package demo;
//
//import com.googlecode.fightinglayoutbugs.FightingLayoutBugs;
//import com.googlecode.fightinglayoutbugs.LayoutBug;
//import com.googlecode.fightinglayoutbugs.WebPage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.net.MalformedURLException;
//import java.util.Collection;
//
//public class AccessibilityTest {
//
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "/Users/rydq/Documents/WorkSpace/IntelliJ/AppiumSample/src/resorces/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//        try {
//            String testPageUrl = "http://www.test.de/";
//            driver.get(testPageUrl);
//            AccessibilityScanner scanner = new AccessibilityScanner(driver);
//            Map<String, Object> audit_report = scanner.runAccessibilityAudit();
//
//            if (audit_report.containsKey("error")) {
//                List<Result> errors = (List<Result>) audit_report.get("error");
//                assertThat("No accessibility errors expected", errors.size(),equalTo(0));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }
//}
