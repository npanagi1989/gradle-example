package uitests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ui.*;

import javax.swing.*;

import java.awt.*;
import java.util.logging.Logger;

import static org.testng.Assert.assertTrue;

public class HomePageTests {

    @AfterMethod
    public static void afterMethod() {
        WebDriverHandler.closeBrowser();
    }

    @Test
    public void homePageWithPageObject() throws InterruptedException {
        HomePage homePage = new HomePage();
        HomePage.open();
        homePage.waitForCookiePolicyPopup();
        //messages in assertions are displayed if assertion is failed - so usually they look like "something wasn't
        // working" rather than "something is working"
        assertTrue(homePage.isCookiesPolicyDisplayed(), "Cookie popup displayed");
        assertTrue(homePage.clickOnSubmitButton());
        assertTrue(homePage.isLogoDisplayed(), "Logo is displayed");
        assertTrue(homePage.verifyDemoButton(), "Demo button is displayed");
        assertTrue(homePage.verifyRealButton(), "Real button is displayed");
        assertTrue(homePage.homeTab(), "Home tab is displayed");
        assertTrue(homePage.tradingTab(), "Trading tab is displayed");
        assertTrue(homePage.platformsTab(), "Platforms tab is displayed");
        assertTrue(homePage.researchAndEducationTab(), "Research and education tab is displayed");
        assertTrue(homePage.promotionsTab(), "Promotions tab is displayed");
        assertTrue(homePage.AboutUsTab(), "About us tab is displayed");
        assertTrue(homePage.partnershipTab(), "Partnership tab is displayed");
        //you already close the browser in @AfterMethod - there's no need to do it twice, or "just in case" :)
        WebDriverHandler.closeBrowser();
    }

    @Test
    public void homePageWithPageFactory() throws InterruptedException {
        HomePageWithPF homePageWithPF = new HomePageWithPF();
        homePageWithPF.open();
        homePageWithPF.waitForCookiePolicyPopup();
        assertTrue(homePageWithPF.isCookiesPolicyDisplayed(), "Cookie popup displayed");
        assertTrue(homePageWithPF.clickOnSubmitButton());
        assertTrue(homePageWithPF.isLogoDisplayed(), "Logo is displayed");
        assertTrue(homePageWithPF.verifyDemoButton(), "Demo button is displayed");
        assertTrue(homePageWithPF.verifyRealButton(), "Real button is displayed");
        assertTrue(homePageWithPF.homeTab(), "Home tab is displayed");
        assertTrue(homePageWithPF.tradingTab(), "Trading tab is displayed");
        assertTrue(homePageWithPF.platformsTab(), "Platforms tab is displayed");
        assertTrue(homePageWithPF.researchAndEducationTab(), "Research and education tab is displayed");
        assertTrue(homePageWithPF.promotionsTab(), "Promotions tab is displayed");
        assertTrue(homePageWithPF.AboutUsTab(), "About us tab is displayed");
        assertTrue(homePageWithPF.partnershipTab(), "Partnership tab is displayed");
        //same comment
        WebDriverHandler.closeBrowser();
    }

    @Test
    public void HomePageSelenide() throws InterruptedException {
        HomePageSelenide homePageSelenide = new HomePageSelenide();
        homePageSelenide.open();
        homePageSelenide.waitForCookiePolicyPopup();
        //you have no assertions in this test :) either change these methods to use conditions that wait for specific states
        //of elements and return no value, or add assertions here
        homePageSelenide.isCookiesPolicyDisplayed();
        homePageSelenide.clickOnSubmitButton();
        homePageSelenide.isLogoDisplayed();
        homePageSelenide.verifyDemoButton();
        homePageSelenide.verifyRealButton();
        homePageSelenide.homeTab();
        homePageSelenide.tradingTab();
        homePageSelenide.platformsTab();
        homePageSelenide.researchAndEducationTab();
        homePageSelenide.promotionsTab();
        homePageSelenide.AboutUsTab();
        homePageSelenide.partnershipTab();
        //same comment
        WebDriverHandlerSelenide.closeBrowser();
    }


}
