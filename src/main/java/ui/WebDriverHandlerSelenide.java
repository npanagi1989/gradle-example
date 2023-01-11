package ui;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

public class WebDriverHandlerSelenide {

    public static void openPage(String url) {
        //this "if" doesn't work correctly - that's why browser is not in 1920 by 1080 resolution
        //if it was pure Selenium, browser wouldn't start at all :)
        if(WebDriverRunner.hasWebDriverStarted()){
            setup();
        }
        Selenide.open(url);
    }

    public static void closeBrowser() {
        Selenide.closeWebDriver();
    }

    private static void setup() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 10;
        Configuration.baseUrl = "https://www.xm.com";
        Configuration.browserSize = "1920x1080";
    }
}
