package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class HomePageSelenide {

    private  static final String URL = "https://www.xm.com/#";;

    private final static SelenideElement logo = $("#navigation-collapse .logo");

    private final static SelenideElement cookiePolicy = $("#cookieModal > div > div");

    private final static SelenideElement cookiesButton = $("#cookieModal > div > div > div.cookie-modal__defaultBlock > div.modal-footer > div.row > div:nth-child(3) > button");

    private final static ElementsCollection demoButton = $$x("//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[1]/a");

    private final static ElementsCollection realButton = $$x("//*[@id=\"hero-content\"]/div[4]/div[1]/div[4]/div/div/div[5]/a");

    private final static SelenideElement homeTab = $(new By.ByClassName("main_nav_home"));

    private final static SelenideElement tradingTab = $(new By.ByClassName("main_nav_trading"));

    private final static SelenideElement platformsTab = $(new By.ByClassName("main_nav_platforms"));

    private final static SelenideElement researchAndEducationTab = $(new By.ByClassName("main_nav_research"));

    private final static SelenideElement promotionsTab = $(new By.ByClassName("main_nav_promotions"));

    private final static SelenideElement aboutUsTab = $(new By.ByClassName("main_nav_about"));

    private final static SelenideElement partnershipsTab = $(new By.ByClassName("main_nav_partners"));

    public void open(){
        WebDriverHandlerSelenide.openPage(URL);
    }

    public void waitForCookiePolicyPopup(){
        cookiePolicy.shouldBe(Condition.appear);
    }

    public boolean isLogoDisplayed(){
        return logo.isDisplayed();
    }

    public boolean isCookiesPolicyDisplayed(){
        return cookiePolicy.isDisplayed();
    }

    public void clickOnSubmitButton(){
        cookiesButton.click();
    }

    public boolean verifyDemoButton(){
        return demoButton.contains(Condition.visible);
    }

    public boolean verifyRealButton(){
        return realButton.contains(Condition.visible);
    }

    public boolean homeTab(){
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
