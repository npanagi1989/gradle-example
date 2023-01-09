package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageWithPF {
    private static final String URL = "https://www.xm.com/#";

    @FindBy(css = "#navigation-collapse .logo")
    private WebElement logo;

    @FindBy(css = "#cookieModal > div > div")
    private WebElement cookiePolicy;

    @FindBy(css = "#cookieModal > div > div > div.cookie-modal__defaultBlock > div.modal-footer > div.row > div:nth-child(3) > button")
    private WebElement cookiesButton;

    @FindBy(xpath = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[1]/a")
    private WebElement demoButton;

    @FindBy(xpath = "//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[5]/a")
    private WebElement realButton;

    @FindBy(className = "main_nav_home")
    private WebElement homeTab;

    @FindBy(className = "main_nav_trading")
    private WebElement tradingTab;

    @FindBy(className = "main_nav_platforms")
    private WebElement platformsTab;

    @FindBy(className = "main_nav_research")
    private WebElement researchAndEducationTab;

    @FindBy(className = "main_nav_promotions")
    private WebElement promotionsTab;

    @FindBy(className = "main_nav_about")
    private WebElement aboutUsTab;

    @FindBy(className = "main_nav_partners")
    private WebElement partnershipsTab;

    public static void open() {
        WebDriverHandler.openPage(URL);
    }

    public HomePageWithPF(){
        PageFactory.initElements(WebDriverHandler.getDriver(), this);
    }

    public void waitForCookiePolicyPopup(){
        WebDriverHandler.getWait().until(ExpectedConditions.visibilityOf(cookiePolicy));
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public boolean isCookiesPolicyDisplayed() {
        return cookiePolicy.isDisplayed();
    }

    public boolean clickOnSubmitButton() {
        if (cookiesButton.isEnabled()) {
            cookiesButton.click();
            if (!cookiesButton.isDisplayed()) ;
        }
        return true;
    }


    public boolean verifyDemoButton() {
        return demoButton.isDisplayed();
    }

    public boolean verifyRealButton() {
        return realButton.isDisplayed();
    }

    public boolean homeTab() {
        return homeTab.isDisplayed();
    }

    public boolean tradingTab() {
        return tradingTab.isDisplayed();
    }

    public boolean platformsTab() {
        return platformsTab.isDisplayed();
    }

    public boolean researchAndEducationTab() {
        return researchAndEducationTab.isDisplayed();
    }

    public boolean promotionsTab() {
        return promotionsTab.isDisplayed();
    }

    public boolean AboutUsTab() {
        return aboutUsTab.isDisplayed();
    }

    public boolean partnershipTab() {
        return partnershipsTab.isDisplayed();
    }
}
