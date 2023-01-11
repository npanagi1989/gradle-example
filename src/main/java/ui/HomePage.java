package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    private static final String URL = "https://www.xm.com/#";

    private static final String logo = "#navigation-collapse .logo";

    //using "copy selector" from dev tools is not a good approach :) this locator can be simplified to 1 class
    private static final String cookiePolicy = "#cookieModal > div > div";

    // same, this locator can be simplified up to 2 steps
    private static final String cookiesButton = "#cookieModal > div > div > div.cookie-modal__defaultBlock > div.modal-footer > div.row > div:nth-child(3) > button";

    //same, but you'll find 2 elements: one for high screen resolution, one for low
    private static final String demoButton = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[1]/a";

    //same, again, 2 elements
    private static final String realButton = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[5]/a";

    //for these tabs, it's better to use a single common locator and findElements() method - it's harder than finding
    //locators one by one, but try that just for exercise!
    private static final String homeTab = "main_nav_home";

    private static final String tradingTab = "main_nav_trading";

    private static final String platformsTab = "main_nav_platforms";

    private static final String researchAndEducationTab = "main_nav_research";

    private static final String promotionsTab = "main_nav_promotions";

    private static final String aboutUsTab = "main_nav_about";

    private static final String partnershipsTab = "main_nav_partners";

    public static void open() {
        WebDriverHandler.openPage(URL);
    }

    public void waitForCookiePolicyPopup(){
        WebDriverHandler.getWait(); //this method does nothing :)
    }

    public boolean isLogoDisplayed() {
        return WebDriverHandler.getDriver().findElement(By.cssSelector(logo)).isDisplayed();
    }

    public boolean isCookiesPolicyDisplayed() {
        return WebDriverHandler.getDriver().findElement(By.cssSelector(cookiePolicy)).isDisplayed();
    }

    public boolean clickOnSubmitButton() { //why does this method return value? why not void? you don't need to assert this -
        //if element is not found, you'll get an exception; if it's found, test will continue to actual checks
        if (WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).isEnabled()) {
            WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).click();
            if (!WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).isDisplayed()) ; //why do you need this "if"? there's no code inside
        }
        return true;
    }


    public boolean verifyDemoButton() {
        return WebDriverHandler.getDriver().findElement(By.xpath(demoButton)).isDisplayed();
    }

    public boolean verifyRealButton() {
        return WebDriverHandler.getDriver().findElement(By.xpath(realButton)).isDisplayed();
    }

    public boolean homeTab() {
        return WebDriverHandler.getDriver().findElement(By.className(homeTab)).isDisplayed();
    }

    public boolean tradingTab() {
        return WebDriverHandler.getDriver().findElement(By.className(tradingTab)).isDisplayed();
    }

    public boolean platformsTab() {
        return WebDriverHandler.getDriver().findElement(By.className(platformsTab)).isDisplayed();
    }

    public boolean researchAndEducationTab() {
        return WebDriverHandler.getDriver().findElement(By.className(researchAndEducationTab)).isDisplayed();
    }

    public boolean promotionsTab() {
        return WebDriverHandler.getDriver().findElement(By.className(promotionsTab)).isDisplayed();
    }

    //methods start with lower case letter :)
    public boolean AboutUsTab() {
        return WebDriverHandler.getDriver().findElement(By.className(aboutUsTab)).isDisplayed();
    }

    public boolean partnershipTab() {
        return WebDriverHandler.getDriver().findElement(By.className(partnershipsTab)).isDisplayed();
    }
}
