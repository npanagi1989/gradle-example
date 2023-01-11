package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverHandler {

    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;

    static {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    public static WebDriver getDriver() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    public static void openPage(String url) {
        getDriver().get(url);
    }

    public static void closeBrowser() {

        getDriver().quit();
        webDriver = null; //adding this to be able to run 2+ tests, explained in last wrap-up session
    }

    public static WebDriverWait getWait() {
        if (webDriverWait == null) {
            webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        }
        return webDriverWait;
    }
}
