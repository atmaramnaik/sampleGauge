import org.junit.Test;

/**
 * Created by atmaramn on 4/9/17.
 */
public class UnitTest {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
        GoogleHomePage.navigate();
        GoogleHomePage.exit();
    }
}
