package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    private static final String URL = "https://www.xm.com/#";

    private static final String logo = "#navigation-collapse .logo";

    private static final String cookiePolicy = "#cookieModal > div > div";

    private static final String cookiesButton = "#cookieModal > div > div > div.cookie-modal__defaultBlock > div.modal-footer > div.row > div:nth-child(3) > button";

    private static final String demoButton = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[1]/a";

    private static final String realButton = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[5]/a";

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
        WebDriverHandler.getWait();
    }

    public boolean isLogoDisplayed() {
        return WebDriverHandler.getDriver().findElement(By.cssSelector(logo)).isDisplayed();
    }

    public boolean isCookiesPolicyDisplayed() {
        return WebDriverHandler.getDriver().findElement(By.cssSelector(cookiePolicy)).isDisplayed();
    }

    public boolean clickOnSubmitButton() {
        if (WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).isEnabled()) {
            WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).click();
            if (!WebDriverHandler.getDriver().findElement(By.cssSelector(cookiesButton)).isDisplayed()) ;
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

    public boolean AboutUsTab() {
        return WebDriverHandler.getDriver().findElement(By.className(aboutUsTab)).isDisplayed();
    }

    public boolean partnershipTab() {
        return WebDriverHandler.getDriver().findElement(By.className(partnershipsTab)).isDisplayed();
    }
}
