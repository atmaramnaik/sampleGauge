import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    // Holds the WebDriver instance
    private static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver(){
        webDriver = getDriver();
        //webDriver.manage().window().setSize(new Dimension(1440, 900));
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
        webDriver.quit();
    }

    public static WebDriver get(){
        return webDriver;

    }

    private static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");
        if (browser == null) {
            return new FirefoxDriver();
        }
        switch (browser)
        {
            case "IE":
                return new InternetExplorerDriver();

            case "CHROME":
            default:
//                String downloadFilepath = "/path/to/download/directory/";
//                Map<String, Object> preferences = new Hashtable<String, Object>();
//                preferences.put("profile.default_content_settings.popups", 0);
//                preferences.put("download.prompt_for_download", "false");
//                preferences.put("download.default_directory", downloadFilepath);
//
//// disable flash and the PDF viewer
//                preferences.put("plugins.plugins_disabled", new String[]{
//                        "Adobe Flash Player", "Chrome PDF Viewer"});
//
//                ChromeOptions options = new ChromeOptions();
//                options.setExperimentalOption("prefs", preferences);
//
//                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                ChromeOptions options=new ChromeOptions();
                options.addArguments("start-maximized");
                return new ChromeDriver(options);

        }
    }
}
