import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        return new ChromeDriver(options);
    }
}
