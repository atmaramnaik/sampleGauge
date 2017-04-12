import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    // Holds the WebDriver instance
    private static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver


    public static WebDriver get(){
        if (webDriver == null)
            webDriver = getDriver();
        return webDriver;

    }

    private static WebDriver getDriver() {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        try {
            return new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),dc);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
