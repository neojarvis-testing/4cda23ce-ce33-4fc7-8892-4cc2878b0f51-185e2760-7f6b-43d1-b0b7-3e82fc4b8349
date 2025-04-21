package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class footerPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public footerPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    /*
    * Method name : clickOnAcceptCookies
    * Author name : C Sai Kiran
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
            test.log(Status.PASS, "click on accept cookies");
            LoggerHandler.info("click on accept cookies");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnAboutUs
    * Author name : C Sai Kiran
    * Description : Clicks on the About Us section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAboutUs(){
        try {
            helper.jsScrollIntoView(HomePageLocators.aboutUs);
            helper.wait(HomePageLocators.aboutUs);
            helper.clickOnElement(HomePageLocators.aboutUs);
            test.log(Status.PASS, "scroll down to footer");
            LoggerHandler.info("scroll down to footer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyAboutUsUrl
    * Author name : C Sai Kiran
    * Description : Verifies the About Us page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyAboutUsUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the about us url");
            LoggerHandler.info("verify the about us url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnStoreFinder
    * Author name : C Sai Kiran
    * Description : Clicks on the Store Finder section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnStoreFinder(){
        try {
            helper.jsScrollIntoView(HomePageLocators.storeFinder);
            helper.wait(HomePageLocators.storeFinder);
            helper.clickOnElement(HomePageLocators.storeFinder);
            test.log(Status.PASS, "click on store finder");
            LoggerHandler.info("click on store finder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyStoreFindUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Store Finder page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyStoreFindUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the store finder url");
            LoggerHandler.info("verify the store finder url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnWEERegulations
    * Author name : C Sai Kiran
    * Description : Clicks on the WEE Regulations section and switches tabs
    * Return Type : void
    * Parameter : None
    */
    public void clickOnWEERegulations(){
        try {
            helper.jsScrollIntoView(HomePageLocators.WEERegulations);
            helper.wait(HomePageLocators.WEERegulations);
            helper.clickOnElement(HomePageLocators.WEERegulations);
            test.log(Status.PASS, "click on WEE Regulations");
            LoggerHandler.info("click on WEE Regulations");
            helper.switchTab();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyWEERegulationsUrl
    * Author name : C Sai Kiran
    * Description : Verifies the WEE Regulations page URL and switches back to the default tab
    * Return Type : void
    * Parameter : None
    */
    public void verifyWEERegulationsUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            helper.switchBackToDefault();
            test.log(Status.PASS, "verify the weeRegulations url");
            LoggerHandler.info("verify the weeRegulations url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnPress
    * Author name : C Sai Kiran
    * Description : Clicks on the Press section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnPress(){
        try {
            helper.jsScrollIntoView(HomePageLocators.press);
            helper.wait(HomePageLocators.press);
            helper.clickOnElement(HomePageLocators.press);
            test.log(Status.PASS, "click on Press");
            LoggerHandler.info("click on Press");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyPressUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Press page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyPressUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the press url");
            LoggerHandler.info("verify the press url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnAffiliates
    * Author name : C Sai Kiran
    * Description : Clicks on the Affiliates section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAffilates(){
        try {
            helper.jsScrollIntoView(HomePageLocators.affilates);
            helper.wait(HomePageLocators.affilates);
            helper.clickOnElement(HomePageLocators.affilates);
            test.log(Status.PASS, "click on Affilates");
            LoggerHandler.info("click on Affilates");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyAffiliatesUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Affiliates page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyAffilatesUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the affilates url");
            LoggerHandler.info("verify the affilates url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnCareers
    * Author name : C Sai Kiran
    * Description : Clicks on the Careers section and switches tabs
    * Return Type : void
    * Parameter : None
    */
    public void clickOnCareers(){
        try {
            helper.jsScrollIntoView(HomePageLocators.careers);
            helper.wait(HomePageLocators.careers);
            helper.clickOnElement(HomePageLocators.careers);
            test.log(Status.PASS, "click on Careers");
            LoggerHandler.info("click on Careers");
            helper.switchTab();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyCareersUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Careers page URL and switches back to default tab
    * Return Type : void
    * Parameter : None
    */
    public void verifyCareersUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            helper.switchBackToDefault();
            test.log(Status.PASS, "verify the careers url");
            LoggerHandler.info("verify the careers url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnGiftCard
    * Author name : C Sai Kiran
    * Description : Clicks on the Gift Card section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnGiftCard(){
        try {
            helper.jsScrollIntoView(HomePageLocators.giftCards);
            helper.wait(HomePageLocators.giftCards);
            helper.clickOnElement(HomePageLocators.giftCards);
            test.log(Status.PASS, "click on gift card");
            LoggerHandler.info("click on gift card");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyGiftCardUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Gift Card page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyGiftCardUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            test.log(Status.PASS, "verify the gift card url");
            LoggerHandler.info("verify the gift card url");
            Base.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : clickOnKlarna
    * Author name : C Sai Kiran
    * Description : Clicks on the Klarna section
    * Return Type : void
    * Parameter : None
    */
    public void clickOnKlarna(){
        try {
            helper.jsScrollIntoView(HomePageLocators.klarna);
            helper.wait(HomePageLocators.klarna);
            helper.clickOnElement(HomePageLocators.klarna);
            test.log(Status.PASS, "click on klarna");
            LoggerHandler.info("click on klarna");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyKlarnaUrl
    * Author name : C Sai Kiran
    * Description : Verifies the Klarna page URL
    * Return Type : void
    * Parameter : None
    */
    public void verifyKlarnaUrl(){
        try {
            String value=helper.getUrl();
            Assert.assertEquals(value, value);
            System.out.println(value);
            Base.driver.navigate().back();
            test.log(Status.PASS, "verify the klarna url");
            LoggerHandler.info("verify the klarna url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : verifyUsefulLinksText
    * Author name : C Sai Kiran
    * Description : Verifies the text for Useful Links section
    * Return Type : void
    * Parameter : None
    */
    public void verifyUsefulLinksText(){
        try {
            String value=helper.getText(HomePageLocators.usefulLinks);
            Assert.assertEquals(value, value);
            System.out.println(value);
            test.log(Status.PASS, "verify the useful links url");
            LoggerHandler.info("verify the useful links url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : captureWebSite
    * Author name : C Sai Kiran
    * Description : Captures a screenshot of the website and saves it as "ELC"
    * Return Type : void
    * Parameter : None
    */
    public void captureWebSite(){
        try {
            Screenshot ss=new Screenshot();
            ss.captureScreenShot("ELC");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Method name : footerFunctionality
    * Author name : C Sai Kiran
    * Description : Executes footer functionality by calling relevant methods
    * Return Type : void
    * Parameter : None
    */
    public void footerFunctionality(){
        clickOnAcceptCookies();
        clickOnAboutUs();
        verifyAboutUsUrl();
        clickOnStoreFinder();
        verifyStoreFindUrl();
        // clickOnWEERegulations();
        // verifyWEERegulationsUrl();
        clickOnPress();
        verifyPressUrl();
        clickOnAffilates();
        verifyAffilatesUrl();
        // clickOnCareers();
        // verifyCareersUrl();
        clickOnGiftCard();
        verifyGiftCardUrl();
        clickOnKlarna();
        verifyKlarnaUrl();
        verifyUsefulLinksText();
        captureWebSite();
    }
    
}
